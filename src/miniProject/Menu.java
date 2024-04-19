package miniProject;


import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Menu {
    Scanner sc = new Scanner(System.in);

    void calendarInquiry (){
        System.out.print("조회할 달력의 년도를 입력하시오>>");
        int year = sc.nextInt();
        System.out.print("조회할 달력의 월을 입력하시오>>");
        int mon = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year, mon - 1, 1);
        int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일
        int lastDay = cal.getActualMaximum(Calendar.DATE); //해당 월의 마지막 일자
        System.out.println("\t"+year+"년 "+mon+"월");
        System.out.printf("%3s%4s%4s%3s%3s%4s%4s\n","SUN,MON,TUE,WEN,THU,FRI,SAT".split(","));

        for (int day = 1, i = 1; day <= lastDay; i++) {
            if (i < firstWeek) {
                System.out.printf("%4c",' ');
            } else {
                System.out.printf("%4d", day++);

            }
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public Event EventAdd() {
        System.out.print("이벤트 제목을 입력하시오>>");
        String name = sc.nextLine();
        System.out.print("이벤트 시작 시간을 입력하시오 (yyyy/MM/dd hh:mm:ss)");
        String start = sc.nextLine();

        System.out.print("이벤트 종료 시간을 입력하시오 (yyyy/MM/dd hh:mm:ss)");
        String last = sc.nextLine();
        System.out.print("이벤트 세부사항을 입력하시오>>");
        String memo = sc.nextLine();
        Event event = new Event(name, memo, start, last);
        return event;
    }

    public void check(Map<String, List<Event>> map,String id) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("조회할 이벤트 날짜를 입력하시오");
            String checkDay = sc.nextLine();
            String [] str = checkDay.split("/");
            for (String s : str) {
                checkDay += s;
            }
            String pattern = "\\d{8}$";

            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(checkDay);
            System.out.println(checkDay);
            try {
                if (m.matches()) {
                    throw new dateRegular();
                }
                checkDay = checkDay.trim();
                System.out.println(map.get(id).get(0));
                return;

            } catch (dateRegular e) {
                System.out.println(e.getMessage());
            }
        }
    }


}













