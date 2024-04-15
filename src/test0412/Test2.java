package test0412;

import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
//        set1 : Integer 클래스의 기본정렬 방식으로 정렬
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 99까지의 숫자를 입력하세요 (종료 : 0)");
        TreeSet <Integer> set1 = new TreeSet<>();
        TreeSet <Integer> set2 = new TreeSet<>(Comparator.reverseOrder());
//        set2 : Integer 클래스의 기본정렬방식의 역순으로 정렬. 내림차순 정렬
        int num;

        try {

            while (true) {
                num = sc.nextInt();
                if (num == 0) {
                    break;
                }
                if (1 <= num && num <= 99) {
                    set1.add(num);
                }
            }
        } catch (InputMismatchException e) {
            sc.next();
        }

        System.out.print("set1: ");
        System.out.println(set1);

//        TreeSet<Integer> set2 = new TreeSet<>((o1,o2)->o2-o1); //람다방식
        set2.addAll(set1);

        System.out.print("set2: ");
        System.out.println(set2);




    }
}
