package chap15;
/*
* Java API의 FunctionalInterface
*
* Consumer 관련 인터페이스
*   accept() 추상 메서드 : 매개변수 있고, 리턴값 없는 메서드
*
*   Consumer<T> : void accept(T)
*   BiConsumer<T,U> : void accept(T,U)
*   DoubleConsumer : void accept(double)
*   IntConsumer : void accept(int)
*   LongConsumer : void accept(long)
*   ObjectDoubleConsumer<T> : void accept(T,double)
*   ObjectIntConsumer<T> : void accept(T,int)
*   ObjectLongConsumer<T> : void accept(T,long)
*
* */


import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Lambda2 {
    public static void main(String[] args) {
        Consumer<String> c1 = t->System.out.println(t+8);
        c1.accept("java"); //java8

        BiConsumer<String, Integer> b1 = (t, u) -> System.out.println(t + u);
        b1.accept("바보",125);
//        1부터 100까지의 합 출력
        IntConsumer c3 = u -> {
            int sum = 0;
            for (int j = 1; j <=u; j++) {
                sum +=j;
            }
            System.out.println("1에서" + u+"까지의 합:"+sum);
        };
        c3.accept(100);
        c3.accept(10);



    }
}
