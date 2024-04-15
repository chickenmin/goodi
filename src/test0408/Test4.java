package test0408;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도를 입력받아 매월 1일과 마지막 일자의 요일을 출력하기
 * [결과]
 * 년도를 입력하세요
 * 2024
 * 2024-01-01 월요일, 2024-01-31 수요일
 * 2024-02-01 목요일, 2024-02-29 목요일
 * 2024-03-01 금요일, 2024-03-31 일요일
 * 2024-04-01 월요일, 2024-04-30 화요일
 * 2024-05-01 수요일, 2024-05-31 금요일
 * ....
 * 2024-12-01 일요일, 2024-12-31 화요일
 */
public class Test4 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("년도를 입력하세요.");
        int year = sc.nextInt();
        sc.close();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date[] day1 = new Date[12];
        Date[] day2 = new Date[12];

        for (int i = 0; i < 12; i++) {
            day1[i] = sf.parse(String.format("%d-%02d-01",year,i+1));
//            day2[i] = sf.parse(String.format("%d-%02d-01",year,i+2));
            day2[i] = sf.parse(String.format("%d-%02d-00",year,i+2)); //00일로 하면 전달 마지막날로 치환됨 (하지만 좋은 방법은 아님)
            day2[i].setTime(day2[i].getTime()-1000*60*60*24);

            SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
            System.out.print(sf2.format(day1[i])+", ");
            System.out.println(sf2.format(day2[i]));

























        }
    }
}
