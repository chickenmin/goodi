package chap11;

import java.util.Random;

/*
* java.util.Random 클래스 : 난수 발생 클래스
* => Math.Random() 함수 이용 => 클래스에서 난수 발생
* 1. 자료형별로 난수 발생 가능
*   nextInt() : 정수형 난수
*   nextInt(n) : 0~(n-1) 사이의 정수형 난수
*   nextDouble() : 0 <= n <1.0
*   nextBoolean() : true/falser
*
* 2. seed 값 설정 가능
*   난수의 복원이 가능함
*   seed값이 변경되면 더 랜덤한 수를 조회할 수 있다.
 * */
public class Random1 {
    public static void main(String[] args) {
        Random rand1 = new Random();
//        System.currentTimeMillis() => 1970년 이후부터 현재까지의 시간을 밀리초로 리턴
        rand1.setSeed(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ":"+ rand1.nextInt(10));
        }
    }
}
