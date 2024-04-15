package chap7;
/*
추상 클래스 간의 상속
 */


abstract class Abs1 {
    int a = 10;
    abstract int getA();

}

abstract class Abs2 extends Abs1{
    int b = 20;

    abstract int getB();
}

class Normal extends Abs2 {

    @Override
    int getA() {
        return a;
    }

    @Override
    int getB() {
        return b;
    }
}
public class AbstractEx2 {
    public static void main(String[] args) {

        Normal n = new Normal();
        System.out.println(n.a);
        System.out.println(n.getA());
        System.out.println(n.b);
        System.out.println(n.getB());
        System.out.println("Abs2 타입으로 형변환");
        Abs2 a2 = (Abs2) n; // 부모타입의 참조변수 <= 자손타입의 참조변수 : 자동형변환 가능
        System.out.println(a2.getA());
        System.out.println(a2.a);
        System.out.println(a2.getB());
        System.out.println(a2.b);

        System.out.println("Abs1 타입으로 형변환");
        Abs1 a1 = a2;
        System.out.println(a1.a);
        System.out.println(a1.getA());
//        System.out.println(a1.b); b는 Abs2의 멤버임
//        System.out.println(a1.getB()); getB()는 Abs2의 멤버임.
        System.out.println("Object 타입으로 형변환");
        Object o = a1;

        System.out.println(((Abs1)o).a);
        System.out.println(((Abs1)o).getA());
        System.out.println(((Abs2)o).getB());
        System.out.println(((Abs2)o).b);


        int a = 15;
        long l = a;
        System.out.println((double) l);




    }
}
