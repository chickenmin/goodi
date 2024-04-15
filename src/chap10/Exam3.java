package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int num = sc.nextInt();
                if (num < 1 || num > 10) {
                    throw new Exception("1~10사이의 숫자만 입력하세요.");
                }
                //num : 1~10사이의 값인 경우
                for (int i = 1; i <= num; i++) {
                    System.out.print("*");
                }
                System.out.println();
                break;
            } catch (InputMismatchException e) {
                System.out.println(sc.next() + "는 숫자가 아닙니다. 숫자만 입력하세요");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
