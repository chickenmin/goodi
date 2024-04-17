package miniProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu m = new Menu();
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 아이디를 입력하세요 >>");
        String id = sc.next().trim();


        while (true) {
            System.out.print("메뉴번호를 선택하시오(1.종료, 2:달력조회, 3:이벤트추가, 4:이벤트조회, 5:이벤트변경, 6:이벤트삭제)>>");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("종료합니다.");
                    return;
                case 2 : m.calendarInquiry();
                    break;
                case 3 :
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
