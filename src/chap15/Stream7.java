package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


/*
* flatMap 예제
*
* flatMap : Stream의 구조를 변경
*   flatMap(Function<T,Stream<U>>) : Stream의 구조를 새로운 Stream 형태로 변경.
*   flatMapToInt(Function<T,IntStream>) : Stream의 구조를 새로운 IntStream 형태로 변경.
*
* */
public class Stream7 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("자바 8 버전에", "추가된 스트림을", "열심히 공부하자");
//        data : String
        list1.stream().flatMap(data->Arrays.stream(data.split(" "))).forEach(System.out::println);

        List<String> list2 = Arrays.asList("10,20,30","40,50,60");
        IntStream isr = list2.stream().flatMapToInt(data->{
//            data : "10,20,30" String형
           String [] starr = data.split(",");   //starr :  {10,20,30}
           int[] intarr = new int[starr.length];
            for (int i = 0; i < starr.length; i++) {
                intarr[i] = Integer.parseInt(starr[i].trim());
            }
            return Arrays.stream(intarr);   //IntStream
        });
//        isr.forEach(n-> System.out.println(n));
//         숫자의 합계 출력
//        System.out.println(isr.sum());
//        숫자 평균
//        System.out.println(isr.average().getAsDouble());
//        숫자 갯수
        System.out.println(isr.count());
    }
}
