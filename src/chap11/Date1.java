package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* Date : 날짜표시 클래스
* SimpleDateFormat : 형식화 클래스. java.text 패키지의 클래스
* 패턴 문자
* yyyy : 년도 4자리
* MM   : 월 2자리
* dd   : 일자 2자리
* HH   : 시간. 0~23시 표시
* hh   : 시간. 1~12시 표시
* mm   : 분. 2자리로 표시
* ss   : 초. 2자리
* E    : 요일
* a    : 오전/오후
*
* 주요 메서드
* String format(Date d) : 날짜 d 값을 받아서, 현재 패턴에 맞는 문자열로 리턴
* Date parse(String fs) : 형식에 맞는 문자열(fs)을 입력받아서, Date 객체로 리턴
*                         ParseException 예외처리 필수
* */
public class Date1 {
    public static void main(String[] args) {
        Date now = new Date();  //현재 날짜 시간
        System.out.println(now);
        SimpleDateFormat f = new SimpleDateFormat("yy-MM-dd HH:mm:ss E a");
        System.out.println(f.format(now));
//       2024-12-24 요일정보 출력하기

        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date day = null;
        try {
            day = f2.parse("2024-12-24 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(day);
//        day를 2024년 12월 24일 요일 출력하기
//        SimpleDateFormat f3 = new SimpleDateFormat("E요일");
        System.out.println(new SimpleDateFormat("E요일").format(day));
        day = new Date(124, 11, 24, 10, 0, 0);
        System.out.println(day);





























    }
}
