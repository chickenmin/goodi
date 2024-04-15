package code_up;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//
//        float w =  ((a*b)/2);
//        System.out.println(w);
//
//        System.out.println();

        for (String e : args) { //command라인의 데이터가 한개인 경우 반복 필요 없음
            //Integer.parseInt(String) : 숫자형 문자열을 int 형으로 변환
            int num = Integer.parseInt(e);
            System.out.print(num + "의 약수 :");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    System.out.print(i + ",");
            }
            System.out.println();
        }

    }
}
