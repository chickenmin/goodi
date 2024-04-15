package chap6;
/*
* 클래스
*   변수(필드) - 클래스변수
*              - 인스턴스 변수
*   메서드      -클래스 메서드
*              -인스턴스 메서드
*
* 클래스 멤버 : 클래스변수, 클래스 메소드 : 클래스명.멤버명
* 인스턴스 멤버 : 인스턴스 변수, 인스ㄴ
*
* 같은 멤버들 간에는 클래스명, 참조변수명 생략가능
* 단 클래스 멤버에서 인스턴스멤버 호출시 객체화가 필요하므로, 참조변수명 사용함
* */

public class MemberCall {
    static int cv1 = 10; //클래스 멤버
    static int cv2 = 20;

    int iv1 = 100; //인스턴스 멤버
    int iv2 = iv1;
    int iv3 = cv1;
   // static int cv3 = iv1; // 클래스 멤버에서 인스턴스 멤버 직접호출 불가
    static int cv3 = new MemberCall().iv1; //객체화 필요
    void method1() { //인스턴스 멤버
        System.out.println("cv1+cv2=" + (cv1 + cv2));
        System.out.println("iv1+iv2=" + (iv1 + iv2));

    }
    static void method2() { //클래스 멤버
        System.out.println("cv1+cv2=" + (cv1 + cv2));
        //클래스 멤버에서 인스턴스 멤버 직접호출 불가
       // System.out.println("iv1+iv2=" + (iv1 + iv2));
        // 객체화 필요
        MemberCall m = new MemberCall();
        System.out.println("iv1+iv2=" + (m.iv1 + m.iv2));
    }

    void method3() {
        method1(); method2();
    }
    static void method4() {

        new MemberCall().method1(); method2();
    }

    public static void main(String[] args) {
        MemberCall m =new MemberCall();
        m.method1();
        m.method2();
        //MemberCall.method2();
        m.method3();
        m.method4();
        //MemberCall.method4();


    }




}
