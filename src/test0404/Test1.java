package test0404;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyInputNumberException extends RuntimeException{
    MyInputNumberException(String msg) {
        super(msg);
    }

}
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cnt=0;
        System.out.println("숫자를 입력하셩");
        while (true) {
            try {
                num = sc.nextInt();
                if (num == 99) { System.out.println("시마이~"); break; }
                if (num < 1 || num > 10) {
                    throw new MyInputNumberException("1 ~ 10까지의 숫자만 입력하세요");
                }
                for (int i = 1; i <= num; i++) {
                    System.out.print("*");
                }
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println(sc.next() + "\t숫자만 입력하세요.");
            } catch (MyInputNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
