package chap11;

import java.util.Calendar;
import java.util.Date;

/*
Calendar  객체에 날짜 생성하기
*/
public class Calendar2 {
    public static void main(String[] args) {
        Calendar day = Calendar.getInstance();
//        날짜 설정
        day.set(2024,11,25); //월 0~11
        System.out.printf("날짜:%d-%d-%d\n",day.get(Calendar.YEAR),
                day.get(Calendar.MONTH)+1,
                day.get(Calendar.DATE));

//
        String w = " 일월화수목금토";
//        day.get(Calendar.DAY_OF_WEEK) : 일:1~ 토:7
        System.out.printf("날짜:%d-%d-%d %c요일\n",
                day.get(Calendar.YEAR),
                day.get(Calendar.MONTH)+1,
                day.get(Calendar.DATE),
                w.charAt(day.get(Calendar.DAY_OF_WEEK)));

//        Calendar 객체 <- Date 객체
        Date now = new Date();
        now.setTime(now.getTime()+(1000*60*60*24));
        System.out.println(now);
//        day 객체로 값을 설정
        day.setTime(now);

        System.out.printf("날짜:%d-%02d-%02d %c요일\n",
                day.get(Calendar.YEAR),
                day.get(Calendar.MONTH)+1,
                day.get(Calendar.DATE),
                w.charAt(day.get(Calendar.DAY_OF_WEEK)));

//        Calendar 객체 -> Date 객체
        Date today = new Date();
        today.setTime(day.getTimeInMillis());
        System.out.println(today);



    }
}
