package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
        User u1 = (User) ois.readObject();
        User u2 = (User) ois.readObject();
        System.out.println("사용자1:"+u1); //부모객체는 SERIALIIZE 구현 안됐기에, 가져올 수 없음
        System.out.println("사용자2:"+u2);

    }
}
