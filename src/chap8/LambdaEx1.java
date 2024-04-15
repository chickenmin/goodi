package chap8;
/*
* 람다식 (함수객체) 예제 : jdk8 이후부터 사용가능함.
*                       람다식으로 사용되는 인터페이스는 FunctionalInterface 이어야 함.
* FunctionalInterface : 추상메서드가 1 개만 존재하는 인터페이스
*
* 추상메서드의 매개변수 없고, 리턴값도 업슨 경우의 람다 표현 방식
* () ->{...}
* */
@FunctionalInterface    //추상 메서드가 한개인 인터페이스.
interface LambdaInterface1{
    void method();
//    void method1();
}
public class LambdaEx1 {
    public static void main(String[] args) {
            //인터페이스는 객체화 불가 => 익명 객체 방식으로 가능함
            // 익명의 객체 방식 . 람다 이전 방식. FunctionalInterface 가 아니어도 상관없음
        LambdaInterface1 f1 = new LambdaInterface1() {
            @Override
            public void method() {
                System.out.println("익명 객체 방식으로 코딩함");
            }
        };
        f1.method();
//      람다 방식 코딩.
        LambdaInterface1 f2 = ()->{
            System.out.println("1. 람다방식으로 코딩");
        };
        f2.method();
//      람다방식으로 코딩시 코딩되는 내용이 한줄인 경우 {} 생략 가능
        f2 = () -> System.out.println("2. 람다방식으로 코딩");
        f2.method();
        execute(()-> System.out.println("execute 메서드 실행"));

        // 1~ 100까지의 합을 execute 메서드로 출력
        execute(()->{
            int sum =0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("1~100까지의 합:" + sum);
        });

    }
     static void execute(LambdaInterface1 f){
        f.method();
     }
}
