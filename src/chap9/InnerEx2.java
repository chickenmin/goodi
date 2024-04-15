package chap9;
/*
* 내부클래스에서 외부 클래스의 private 멤버에 접근
* */

class Outer2{
    private int outerIv = 10;
    private static int outerCv = 20;
    class InstanceInner{ //outerIv 와 InstanceInner는 같은 멤버이기 때문에 private이어도 서로 호출 가능.
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner{
//        static int siv = outerIv; // outerIv는 객체화가 되어야 하는데, siv는 static이기 때문에 에러

        static int siv = new Outer2().outerIv;
        int siv2 = outerCv;
        static int scv = outerCv;
    }

    void method(int pv) {
        //pv--;
        int lv = 500;
//        lv +=10;
        class LocalInner{ //지역내부 클래스
            int liv = outerIv;
            int liv2 = outerCv;
 /* 지역 내부 클래스의 멤버 메서드에 외부메서드(method(int pv))의 지역변수를 상수화되어야 접근 가능함
 *  외부 메서드의 지역변수가 변경이 없으면 상수로 판단함.
 *  메서드의 지역변수에 변경이 있으면 내부클래스의 멤버메서드에서 오류 발생
 * */
            void method(int num) {
                num++;
//                lv +=10;
                System.out.println(lv);
                System.out.println("outerIv=" + outerIv);
                System.out.println("outerCv=" + outerCv);
                System.out.println("liv=" + liv);
                System.out.println("liv2=" + liv2);
                System.out.println("pv=" + pv); // 상수화 필요
//                pv++; // 상수화 필요. 외부메서드의 지역변수
                System.out.println("num=" + num);
            }
        }

        LocalInner li = new LocalInner();
        li.method(3);
    }
}
public class InnerEx2 {
    public static void main(String[] args) {
//        외부 클래스의 객체 생성
        Outer2 out = new Outer2();
//        System.out.println(out.outerIv); //PRIVATE 멤버를 다른 클래스에서 접근이 불가하기 때문에
//        System.out.println(out.outerCv);
//        InstanceInner, StaticInner 객체 생성하여 모든 멤버값 출력하기
        Outer2.InstanceInner instance = out.new InstanceInner();
        Outer2.StaticInner sta = new Outer2.StaticInner();
        System.out.println("in iiv=" + instance.iiv);
        System.out.println("in iiv2="+instance.iiv2);

        System.out.println();
        System.out.println("sta siv="+sta.siv);
        System.out.println("sta siv2="+sta.siv2);
        System.out.println("sta scv="+sta.scv);

        out.method(1000);

        int lv = 100;
//        lv++
        Runnable r = () -> {    //익명의 객체
            System.out.println(lv);     // 상수화필요
        };
        r.run();





    }
}
