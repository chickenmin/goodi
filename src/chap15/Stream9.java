package chap15;

import java.util.Arrays;
import java.util.stream.Stream;

/*
* boxed 메서드 : IntStream = >Stream<Integer>
    asLongStream() : IntStream => LongStream
    asDoubleStream() : IntStream => DoubleStream
* */
public class Stream9 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        System.out.println("IntStream -> Stream<Integer>");
        Stream<Integer> st =Arrays.stream(arr).boxed();
        st.forEach(i-> System.out.print(i.hashCode()+" "));
//        Arrays.stream(arr).boxed().forEach(i-> System.out.print(i.hashCode()+" "));
        System.out.println();
        Integer arr2[] = {10,20,30,40,50,60};
        Arrays.stream(arr2).forEach(i-> System.out.print(i.hashCode()+" "));
        System.out.println("Stream<Integer> -> IntStream");
        System.out.println("arr2 배열 합 : "+ Arrays.stream(arr2).mapToInt(s->s).sum());
//        System.out.println("arr2 배열 합 : "+ Arrays.stream(arr2).mapToInt(s->s.intValue()).sum());
        System.out.println("IntStream => DoubleStream");
        Arrays.stream(arr).asDoubleStream().forEach(a-> System.out.print(a+" "));
        System.out.println();

        System.out.println("IntStream => LongStream");
        Arrays.stream(arr).asLongStream().forEach(a-> System.out.print(a+" "));
        System.out.println();

    }
}
