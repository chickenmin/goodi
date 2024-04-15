package test0404;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int jNum = (int) (Math.random()*100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("맞혀보셔: ");
        int uNum, cnt =0;
        while (true) {
            try {
                uNum = sc.nextInt();
                cnt++;
                if (uNum > 100 || uNum < 1) {
                    throw new MyInputNumberException("1 과 100사이의 숫자만 입력하세요.");
                }
                if (uNum == jNum) {
                    System.out.println(cnt + "번 만에 맞혔슈!!" + " 맞슈~");
                    break;
                } else if (uNum > jNum) {
                    System.out.println("작은 수유");
                } else if (jNum > uNum) {
                    System.out.println("커유");
                }
            } catch (MyInputNumberException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("숫자만 입력하세요.");
            }


        }
    }
}
