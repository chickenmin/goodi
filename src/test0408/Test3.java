package test0408;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2024-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2024-01-03
2024-01-03 -2024-01-01 일자의 차이 : 2
 */
public class Test3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
        String day1 = sc.nextLine();

        System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
        String day2 = sc.nextLine();
        sc.close();

        SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");

        Date d1 = f1.parse(day1);
        Date d2 = f1.parse(day2);

        System.out.print(day1);
        System.out.print(" "+day2+ " 일자의 차이 : ");
        long diff = (d1.getTime() - d2.getTime()) / (1000 * 60 * 60 * 24);
        System.out.println(Math.abs(diff));




    }
}
