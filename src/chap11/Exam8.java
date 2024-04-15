package chap11;

import java.util.Calendar;
import java.util.Scanner;

public class Exam8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("년도를 입력하세요");
            int year = sc.nextInt();
            sc.nextLine();
        String w = " 일월화수목금토";

        Calendar c = Calendar.getInstance();
        for (int i = 0; i < 12; i++) {
            c.set(year,i,1);
            System.out.printf("날짜:%d-%02d-%02d %c요일\t",
                    c.get(Calendar.YEAR),
                    c.get(Calendar.MONTH)+1,
                    c.get(Calendar.DATE),
                    w.charAt(c.get(Calendar.DAY_OF_WEEK))
            ); //첫째날

            int dayL = c.getActualMaximum(Calendar.DATE);

            c.set(year, i, dayL);
            System.out.printf("날짜:%d-%02d-%02d %c요일\n",
                    c.get(Calendar.YEAR),
                    c.get(Calendar.MONTH)+1,
                    c.get(Calendar.DATE),
                    w.charAt(c.get(Calendar.DAY_OF_WEEK))
            ); //마지막날






        }



    }
}
