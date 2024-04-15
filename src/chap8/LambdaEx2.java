package chap8;
/*
* 추상메서드의 매개변수가 있고, 리턴타입이 없는 경우
* (매개변수) -> {...}
* 매개변수가 1개인 경우 () 생략 가능
* 실행구문의 문장이 한개인 경우 {} 생략가능
 */
interface LambdaInterface2{
    void method(int a);
}
public class LambdaEx2 {
    public static void main(String[] args) {
        LambdaInterface2 f = (i) -> { //i형의 자료형 int
            System.out.println(i*5);
        };
        f.method(5); f.method(2);
//        f.method("a");
        f = i -> System.out.println(i + i);
        f.method(10);
        calc(f,50);
//      calc 함수를 이용하여 입력된 숫자까지의 합을 출력하는 프로그램 표현하기
        f = (i) -> {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += j;
            }
            System.out.println(sum);
        };
        calc(f,4);

    }

     static void calc(LambdaInterface2 f, int a) {
        f.method(a);
    }

}
