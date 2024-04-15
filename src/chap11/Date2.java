package chap11;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 날짜 설정
* */
public class Date2 {
    public static void main(String[] args) {
        Date now = new Date(); //현재 일시
//       getTime() : 1970년 이후부터 현재까지의 밀리초
        System.out.println(now.getTime());  //
        System.out.println(System.currentTimeMillis());
//        현재부터 5일 이후의 날짜와 요일 출력
        Date day = new Date();
        day.setTime(now.getTime() + 1000*60*60*24*5); //1000밀리초 = 1초,
        System.out.println(now);
        System.out.println(day);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
    }
}
