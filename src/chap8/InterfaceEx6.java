package chap8;
/*
* jdk 8.0 이후에 인터페이스에 추가된 멤버 => 구현부가 존재하는 메서드  ok
* default 메서드 :
*   - 구현부가 존재
*   - 인스턴스 메서드
*   - 오버라이딩 가능 : 다중구현에서 동일한 메서드가 2개 이상인 경우
*                    구현 클래스에서 오버라이딩이 필요
*
* static 메서드 :
*   - 구현부가 존재
*   - 클래스 메서드, 클래스 멤버
*   - 다중구현에서 동일한 이름의 메서드가 2개 이상인 경우도 상관 없음.
*      [ 인터페이스명.static메서드명 ] 호출
* */

interface MyInterface1{
    void method();
    default void method1(){
        System.out.println("MyInterface1의 default 메서드 : method1");
    }
    static  void staticMethod(){
        System.out.println("MyInterface1의 static 메서드 : staticMethod");
    }
}
interface MyInterface2{
    void method();
    default void method1(){
        System.out.println("MyInterface2의 default 메서드 : method1");
    }
    static  void staticMethod(){
        System.out.println("MyInterface2의 static 메서드 : staticMethod");
    }
}
class Parent{
    public void method2(){
        System.out.println("Parent 클래스의 멤버 메서드 : method2");
    }
}

class Child extends Parent implements MyInterface1,MyInterface2{
    public void method(){               // MyInterface1 , MyInterface2 인터페이스의 추상메서드 오버라이딩 : 한 개만 해주면됨
        System.out.println("Child 클래스에서 오버라이딩된 메서드: method");
    }

   //  default 메서드드가 2개 이므로 오버라이딩 필요 (1개인 경우는 오버라이딩 안해도 되는디 겹치니께롱)
    public void method1(){
        System.out.println("Child 클래스에서 오버라이딩된 메서드: method1");
        MyInterface1.super.method1(); // MyInterface1의 method1  호출
        MyInterface2.super.method1(); // MyInterface2의 method1  호출
    }

}
public class InterfaceEx6 {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
        c.method1();
//        c.staticMethod();
//        Child.staticMethod();
        MyInterface1.staticMethod();
        MyInterface2.staticMethod();

    }
}




































