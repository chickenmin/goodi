package test0408;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * phoneNumArr 에서
 * 전화번호 일부를 입력받아 입력받은 번호를 포함하고 있는 번호를 찾기
   q를 입력받을때 까지 계속 반복하기

[결과]
찾고자 하는 번호를 입력하세요(종료:q)
02
02-3456-7890
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
1234
051-1234-5678
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
q
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern;

        String[] phoneNumArr = {
                "02-3456-7890","053-2456-7980",
                "088-2346-9870","013-3456-7890",
                "051-1234-5678","02-1234-7890"};

        do {
            System.out.println("찾고자 하는 번호를 입력하세요(종료:q)");
            pattern = sc.nextLine();
            for (String s : phoneNumArr) {
                Pattern p = Pattern.compile(String.format("%s",pattern));
                Matcher m = p.matcher(s);
                if (m.find()) {
                    System.out.println(s);
                }
            }

        }while (!pattern.equalsIgnoreCase("q"));
        System.out.println("종료합니다");
        sc.close();

//        ======================================================================================

       /* String[] phoneNumArr = {
                "02-3456-7890","053-2456-7980",
                "088-2346-9870","013-3456-7890",
                "051-1234-5678","02-1234-7890"};
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("찾고자 하는 번호를 입력하세요(종료:q)");
            String input = s.nextLine().trim();
            if (input.equals("")) continue;
            else if (input.equalsIgnoreCase("Q")) break;
            String pattern = input;
            Pattern p = Pattern.compile(pattern);
            int cnt = 0;
            for (int i = 0; i < phoneNumArr.length; i++) {
                String phoneNum = phoneNumArr[i];
                String num = phoneNum.replace("-",""); // -제거 : -사이의 번호 검색 ex)11검색시 051-1234 도 색출되게
                Matcher m = p.matcher(num);
                if (m.find()) {
                    cnt++;
                    System.out.println(phoneNum);
                }
            }
            if(cnt == 0)
                System.out.println(input + ":찾는 번호가 없습니다.");
        }

*/

    }
}
