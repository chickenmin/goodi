package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(true) {
            try {
                System.out.println("숫자를 입력하세요:");
                num = sc.nextInt();
                System.out.println(num);
                for (int i = 1; i <= num; i++) {
                    System.out.print("*");
                } break;
            } catch (InputMismatchException e) {
                System.out.println(sc.next()+"는 숫자가 아닙니다. 숫자만 입력하세요.");
                  // 문자열로 읽기
            }

        }


    }

}
