package miniProject;

import java.io.IOException;
import java.util.*;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        List<Event> list = new ArrayList<>();
        Menu m = new Menu();
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 아이디를 입력하세요 >>");
        String id = sc.next().trim();
        Map<String, List<Event>> map = new HashMap<>();

        while (true) {
            System.out.print("메뉴번호를 선택하시오(1.종료, 2:달력조회, 3:이벤트추가, 4:이벤트조회, 5:이벤트변경, 6:이벤트삭제)>>");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("종료합니다.");
                return;
            }
            Store s = new Store(id); //아이디별 폴더 생성
            switch (choice) {
                case 2 : m.calendarInquiry();
                    break;
                case 3 :
                    Event e = m.EventAdd();//event 객체 생성
                    list.add(e);
                    map.put(e.getday(), list); //날짜 : 키값 , 이벤트가 객체
                    System.out.println(e.getday());
                    s.createF(e.getday(),e.getName()); //날짜폴더, 일정이름 파일 만들기
                    s.outToFile(e);
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6:
                    break;
            }
        }
    }
}