package chap15;
/*
* 함수 객체와 내부클래스 예제
* */
interface LambdaInterface{
    void method();
}
class Outer{
    public int iv = 10;
    void method(){
        int iv = 20;
//        람다 방식으로 객체생성
        LambdaInterface f = () -> {
//            Outer.this.iv : 외부클래스의 멤버 접근
            System.out.println("Outer.this.iv=" + Outer.this.iv);
//            this.iv : 외부클래스 객체의 iv 값 접근 가능
            System.out.println("Outer.iv=" + this.iv);
            System.out.println("iv="+iv);
        };

        f.method();
//        인터페이스의 객체 생성 : 내부클래스의 객체로서
        LambdaInterface f2 = new LambdaInterface() {
            int iv = 30;
            @Override
            public void method() {
//                Outer.this.iv : 외부클래스의 멤버접근
                System.out.println("Outer.this.iv=" + Outer.this.iv);
//                this.iv : 내부 클래스의 멤버
                System.out.println("Outer.iv=" + this.iv); //30
                System.out.println("iv="+iv); //30
            }
        };
        f2.method();
    }
}
public class Lambda1 {
    public static void main(String[] args) {
        new Outer().method();

    }
}
