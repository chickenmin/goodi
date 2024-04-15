package chap6;
/*
멤버 메서드(멤버함수, function)
[접근제어자] [제어자] 리턴타입 메서드명(매개변수) => 선언부
{...}                                     =>  구현부

리턴타입 : 메서드 종료후 전달되는 값의 자료형
          void인 경우는 전달 값이 없음.
메개변수 : 메서드 호출시 메서드에 전다되는 값의 자료형 설정

 return 예약어 : 메서드 종료
    리턴타입 void   : return 생략가능. 메서드의끝을 만나면 메서트 종료
    리턴타입 있음  :

 */

class Math1 {
    int add1(int a, int b) {
        return  a+b; //a+b 자료형 :int, 리턴타입:int
    }


    long add2(int a, int b) {
        return a+b; //a+b 자료형:int, 리턴타입:long => 자동형변환
    }

    void add3(int a, int b) { //리턴타입:void =>리턴값이 없음
        System.out.println(a+b);
        return ; // 함수 종료. 생략가능 .
    }
}
public class MathEx1 {
    public static void main(String[] args) {
        Math1 m1 = new Math1();
        int a1 = m1.add1(10, 20);
        System.out.println();

    }
}
