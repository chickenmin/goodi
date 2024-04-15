package chap10;
/*
* 오버라이딩에서의 예외처리
*  -부모클래스의ㅣ 메서드와 자손클래스의 메서드의 선언부분이 같아야한다.
*  - 단, 접근제어자는 넓은 범위 가능
*  - 예외 처리는 좁은 범위는 가능함
* */


class Parent{
    protected void method() throws RuntimeException{
        System.out.println("Parent 클래스의 method");
    }
}

//  ArithmeticException, NullPointerException => RuntimeException 하위 클래스
//                                               RuntimeException 보다 좁은 범위

//IOException => Exception의 하위 클래스
class Child extends Parent{
    public void method() throws ArithmeticException, NullPointerException{
        System.out.println("Child 클래스의 method");
    }
}
public class Exception8 {
    public static void main(String[] args) {
        new Child().method();
    }
}
