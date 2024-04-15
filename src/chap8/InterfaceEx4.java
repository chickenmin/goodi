package chap8;

import java.util.Scanner;

class Lazerzet implements Printable{
    public void print(){
        System.out.println("레이저젯 프린터로 프린트함");
    }
}
class Inkzet implements Printable{
    public void print(){
        System.out.println("잉크젯 프린터로 프린트함");
    }
}

class PrintManager{

    // Printable 리턴 :Printable 인터페이스의 구현클래스를 리턴
    public static Printable getPrint(String type) {
        if (type.equals("INK")){
            return new Inkzet();
        } else return new Lazerzet();
    }
}
public class InterfaceEx4 {
    public static void main(String[] args) {
        Printable p = PrintManager.getPrint("INK");
        p.print(); // Inkzet 객체
        p = PrintManager.getPrint("LAZER");
        p.print(); //Lazerzet 객체

    }
}
