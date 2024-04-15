package chap6;
/*
 * 메서드 오보로딩 : 메서드의 다형성
 * 1. 동일한 클래스 내부에 같은 이름을 가진 메서드가 여러개 존재할 수 있다
 * 2. 단 매개변수의 목록이 달라야 한다.
 * */


class Math2 {
    int a = 100;

    int add(int b) {
        System.out.println("1: ");
        return a + b;
    }

    double add(double b) {
        System.out.println("2:");
        return a + b;
    }

    String add(String b) {
        System.out.println("3 :");
        return a + b;
    }
}
public class OverloadingEx1 {
    public static void main(String[] args) {
        Math2 m = new Math2();
        System.out.println(m.add(10));
        System.out.println(m.add(10.5));
        System.out.println(m.add("번"));
        System.out.println(m.add(10L));
        // LONG 형이 자동형변환이 가능한  DOUBLE형 메소드 호출
    }

}
