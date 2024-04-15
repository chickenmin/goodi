package chap11;

import java.util.Calendar;
import java.util.Scanner;

public class Exam9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도와 월을 입력하세요");
        int year = sc.nextInt();
        int mon = sc.nextInt();

        String w = " 일월화수목금토일";
        String w1 = "일월화수목금토일";
        Calendar c = Calendar.getInstance();
        c.set(year,mon-1,1);
        int week = c.get(Calendar.DAY_OF_WEEK); //첫날의 요일
        int dayL = c.getActualMaximum(Calendar.DATE); // 마지막날


        char[] carr = w.toCharArray();
        char[] carr2 = w1.toCharArray();

        for (char q : carr2) {
            System.out.print(q);
            System.out.printf("\t");
        } //상단 요일 출력 = 요일별 공백tab
        System.out.println();

        for (int i = 0; i <= week; i++) {
            c.set(year, mon-1, 1);
            if (week != i) {
                System.out.printf("\t");
            } else {
                System.out.print(c.get(Calendar.DATE));
                System.out.printf("\t");
            }
        }


        int weekN; //주차

        for (int i = 2; i <= dayL; i++) {
            weekN = c.get(Calendar.WEEK_OF_MONTH);
            c.set(year, mon, i);
            if (weekN !=c.get(Calendar.WEEK_OF_MONTH) ){
                System.out.println();
            }
            System.out.printf("%d\t",c.get(Calendar.DATE));


        }





    }
}
