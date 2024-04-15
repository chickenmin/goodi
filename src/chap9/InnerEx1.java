package chap9;
/*
* 내부 클래스(중첩 클래스) 예제
*   - 클래스 내부에 존재하는 클래스
*   - 참조자료형으로 사용됨. 객체화 가능. Object 클래스의 하위 클래스.
*   - 다른 클래스를 상속 받기 가능
*   - 자료형 : 외부 클래스.내부클래스
*   - 바이트 코드 생성
*   - 외부 클래스의 private 멤버 접근 가능
*
* 인스턴스 내부 클래스
*   - 외부 클래스의 객체화가 되어야 클래스 기능 사용 가능
*   new 외부 클래스(..)new 내부클래스(..)
*
* static 내부 클래스
*   - 외부 클래스의 객체화가 필요 없음
*   new 외부클래스명.내부클래스명(...)
* */

class Outer1{ //외부클래스
    class InstanceInner{    // 인스턴스 내부클래스
        int iv = 100;
        static int cv = 10;
        final static int MAX = 100;
    }

    static class StaticInner{   //static(정적) 내부클래스
        int iv = 300;
        static int cv = 400;
        final static int MAX = 500;
    }

    void method(){
        class LocalInner{   //로컬 내부클래스 : 메서드 내부에서만 접근이 가능
            int iv = 600;
            static int cv = 700;
            final static int MAX = 800;
        }
        LocalInner li = new LocalInner();
        System.out.println("LocalInner.iv = " + li.iv);
        System.out.println("LocalInner.cv = " + LocalInner.cv);
        System.out.println("LocalInner.MAX = " + LocalInner.MAX);
    }

    static void method2(){
        class LocalInner{
            int iv = 900;
            static int cv = 1000;
            final static int MAX = 1100;

        }
        LocalInner li = new LocalInner();
        System.out.println("LocalInner.iv = " + li.iv);
        System.out.println("LocalInner.cv = " + LocalInner.cv);
        System.out.println("LocalInner.MAX = " + LocalInner.MAX);

    }
}
public class InnerEx1 {
    public static void main(String[] args) {
        new Outer1().method();
        Outer1.method2(); //메서드2 호출
        Outer1 o = new Outer1();
        Outer1.InstanceInner oi = new Outer1().new InstanceInner(); //이너클래스의 객체화
        System.out.println("Instance.iv"+oi.iv);
        System.out.println("Instance.cv= "+ Outer1.InstanceInner.cv);
        System.out.println("Instance.MAX= "+ Outer1.InstanceInner.MAX);

        //staticInner 내부 클래스의 객체화
        Outer1.StaticInner os = new Outer1.StaticInner();
        System.out.println("StaticInner.iv = " + os.iv);
        System.out.println("StaticInner.cv = " + Outer1.StaticInner.cv);
        System.out.println("StaticInner.MAX = " + Outer1.StaticInner.MAX);

    }
}

//프로펕티즈 - 쇼인시스템익스플로러