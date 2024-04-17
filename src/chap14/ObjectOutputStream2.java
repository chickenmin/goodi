package chap14;

import java.io.*;

/*
* 상속 관계에서의 직렬화
* */
class UserInfo{
    protected String name;
    protected  String password;
    public UserInfo() {}

    public UserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public String toString() {
        return name+","+password;
    }
}

class User extends UserInfo implements Serializable{
    private int age;

    public User(String name, String password, int age) {
        super(name, password);this.age = age;
    }

    // 부모 클래스 멤버 직렬화에 추가하기
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.writeUTF(name);
//        out.writeUTF(password);   //비번 안보낼래~ 보내지도 않을거면, 읽지도 않아야함
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
//        password = in.readUTF();
        in.defaultReadObject();
    }
    @Override
    public String toString() {
        return "["+name +","+password+","+age+"]";
    }
}
public class ObjectOutputStream2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.ser"));
        User u1 = new User("홍길동", "1234", 20);
        User u2 = new User("김삿갓", "5678", 30);
        oos.writeObject(u1);
        oos.writeObject(u2);
        System.out.println("사용자1:"+u1);
        System.out.println("사용자2:"+u2);


    }
}
