package chap11;

import java.util.Calendar;
import java.util.Scanner;

public class Exam9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도와 월을 입력하세요");
        int year = sc.nextInt();
        int mon = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year,mon-1,1);
        int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일
        int lastDay = cal.getActualMaximum(Calendar.DATE); //해당 월의 마지막 일자
        System.out.println("\t" + year + "년 " + mon + "월");

        System.out.printf("%3s%4s%4s%3s%3s%4s%4s\n","일월화수목금토".split(""));

//        1일부터 LASTDAY 까지출력
        for (int day = 1, i=1; day <= lastDay; i++) {
            if (i < firstWeek) {
                System.out.printf("%4c",' ');
            }
            System.out.printf("%4d",day++);
            if (i % 7 == 0) {
                System.out.println();
            }
        }

//        2차원 배열로 달력 만들기

        int [][] calarr = new int[7][7];
        for (int i = 1; i <= lastDay; i++) {
            cal.set(year,mon-1,i);
            int week = cal.get(Calendar.DAY_OF_WEEK); //요일
            int weekcnt = cal.get(Calendar.WEEK_OF_MONTH);  //월의 몇번째주
            calarr[weekcnt-1][week-1] = i;
        }

        System.out.println("\n\n\t" + year + "년" + mon + "월");
        System.out.printf("%3s%4s%4s%3s%3s%4s%4s\n","일월화수목금토".split(""));

        for (int i = 0; i < calarr.length; i++) {
            for (int j = 0; j < calarr[i].length; j++) {
                if (calarr[i][j] == 0) {
                    System.out.printf("%4c", ' ');
                } else {
                    System.out.printf("%4d", calarr[i][j]);
                }
            }
            System.out.println();
        }


    }
}
