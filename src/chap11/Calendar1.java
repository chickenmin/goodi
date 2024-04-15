package chap11;

import java.util.Calendar;

/*
* Calendar 클래스 : 추상 클래스 (객체화 불가) => new Calendar() 형태로 객체화가 안된다는 의미
* static 메서드 : getInstance()메서드로 객체를 리턴
* */
public class Calendar1 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // 현재일시
//        클래스명 출력
        System.out.println(now.getClass().getName()); // java.util.GregorianCalendar
//        칼린더를 상속받은 그레고리언칼린더 인스턴스를 통해 현재일시가 리턴되는것
        System.out.println(now);
//        java.util.GregorianCalendar[time=1712622802976,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",...
//        get(int) : 일자 시간 관련 정보 제공 메서드
        System.out.println("년도:" + now.get(Calendar.YEAR));                            //년도:2024
        System.out.println("년도:" + now.get(1));                            //년도:2024
        System.out.println("월(0~11):" + now.get(Calendar.MONTH));                       //월(0~11):3
        System.out.println("년도 기준 몇째주:" + now.get(Calendar.WEEK_OF_YEAR));          //년도 기준 몇째주:15
        System.out.println("월 기준 몇째주:" + now.get(Calendar.WEEK_OF_MONTH));           //월 기준 몇째주:2
        System.out.println("일자:" + now.get(Calendar.DATE));                            //일자:9
        System.out.println("월 기준 일자:" + now.get(Calendar.DAY_OF_MONTH));             //월 기준 일자:9
        System.out.println("년 기준 일자:" + now.get(Calendar.DAY_OF_YEAR));              //년 기준 일자:100
        System.out.println("요일(1:일~7:토):" + now.get(Calendar.DAY_OF_WEEK));           //요일(1:일~7:토:)3
        System.out.println("월기준 몇째주 요일:" + now.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //월기준 몇째주 요일:2 //월기준 몇번째 화요일이냐
        System.out.println("오전(0)오후(1):"+now.get(Calendar.AM_PM));          //오전(0)오후(1):0
        System.out.println("시간(0~11): "+now.get(Calendar.HOUR));            //시간(0~11): 9
        System.out.println("시간(0~23): "+now.get(Calendar.HOUR_OF_DAY));     //시간(0~23): 9
        System.out.println("분: "+now.get(Calendar.MINUTE));                  //분: 43
        System.out.println("초: "+now.get(Calendar.SECOND));                  //초: 45
        System.out.println("밀리초: "+now.get(Calendar.MILLISECOND));          //밀리초: 557
        System.out.println("TimeZone: " + now.get(Calendar.ZONE_OFFSET)/(1000*60*60)); //TimeZone: 9 :한국은 9시간 차이

//        마지막 일자
        System.out.println("이번달의 마지막 일자: " + now.getActualMaximum(Calendar.DATE));  //이번달의 마지막 일자: 30


    }
}
