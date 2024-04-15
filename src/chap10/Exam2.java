package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자를 입력: ");
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.print("*");
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력하세요");
        }
    }
}
