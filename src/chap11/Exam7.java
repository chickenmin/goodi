package chap11;

/*
* 연도와 월을 입력받아 년월의 1일과 마지막 일자의 요일을 출력
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("년도와 월을 입력하세요.");
        int year = sc.nextInt();
        int month = sc.nextInt();
        sc.close();

        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd");

        Date day1 = f2.parse(String.format("%4d-%02d-01",year,month)); //년도 4자리, 월2자리(월 1자리면 앞에 0써라)
        Date day2 = f2.parse(String.format("%d-%d-01",year,month+1));
        day2.setTime(day2.getTime()-1000*60*60*24);

        SimpleDateFormat f3 = new SimpleDateFormat("yyyy-MM-dd E요일");
        System.out.println("첫째날: "+f3.format(day1));
        System.out.println("마지막날: " +f3.format(day2));




    }
}
