package chap14;

/*
* ObjectOutputStream1.java 에서 저장한 object.ser 파일의 객체 읽어 오기
* */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
        Customer c1 = (Customer) ois.readObject();
        Customer c2 = (Customer) ois.readObject();
        System.out.println(c1+","+c2);

    }
}
