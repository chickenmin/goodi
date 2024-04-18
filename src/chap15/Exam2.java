package chap15;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**/
public class Exam2 {
    public static void main(String[] args) {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        IntStream is = r.ints(10000,1,101);
        int[] arr = is.toArray();
        long stime = System.currentTimeMillis();
        int sum = 0, esum = 0, osum=0,ecnt=0, ocnt=0;
        for (int i : arr) {
            sum += i;
            if (i % 2 == 0) {
                esum += i;
                ecnt++;
            } else osum +=i; ocnt++;

        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + (double) sum / arr.length);
        System.out.println("짝수 평균: "+(double)esum/ecnt);
        System.out.println("홀수 평균: " + (double) osum / ocnt);
        System.out.println("짝수 갯수: "+ecnt);
        System.out.println("홀수 갯수: "+ocnt);
        System.out.println("배열방식으로 걸리는 시간" + (System.currentTimeMillis()-stime));
        System.out.println("=======================================================");


        System.out.println("총합: " + Arrays.stream(arr).sum());
        System.out.println("평균: " + Arrays.stream(arr).average().getAsDouble());
        System.out.println("짝수의 평균: " + Arrays.stream(arr).filter(s->(s %2 ==0)).average().getAsDouble());
        System.out.println("홀수의 평균: " + Arrays.stream(arr).filter(s->(s %2 ==1)).average().getAsDouble());
        System.out.println("짝수의 갯수: " + Arrays.stream(arr).filter(s->(s %2 ==0)).count());
        System.out.println("홀수의 갯수: " + Arrays.stream(arr).filter(s->(s %2 ==1)).count());
        System.out.println("스트림으로 걸리는 시간" + (System.currentTimeMillis()-stime));


    }
}
