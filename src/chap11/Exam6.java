package chap11;

/*
* getRand(f,t) 함구 구현하기
* f~t */

import java.util.Random;

public class Exam6 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(getRand(1, -3) + ",");
//            1 - (-3) : 0~4 + (-3)
        }
        System.out.println();
        for (int i = 0; i < 20; i++) {
            System.out.print(getRand(-1, 3) + ",");
//            3 - (-1) :0 ~4 + (-1)
        }

    }

    private static int getRand(int f, int t) {
        int min, max;
        max = Math.max(f,t);
        min = Math.min(f, t);

        int cha = max-min;

        Random r = new Random();
//        return r.nextInt(cha+1)+min; //0~cha 변수까지 임의의 수

        return (int)(Math.random()*(cha+1)) + min;





    }
}
