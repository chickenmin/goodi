package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam5 {
    public static void main(String[] args) {
        String data = "번호:10,이름:홍길동,국어:100,영어:70,수학:85,과학:95, 사회:90";
        String scorePattern = "\\d{1,3}"; // 숫자 2~3자리
        Pattern p = Pattern.compile(scorePattern);
        Matcher m = p.matcher(data.substring(data.indexOf(",")+1));
       int sum = 0, cnt = 0;
        while (m.find()) {
//            if (cnt == 1) {
//                continue;
//            }
            System.out.print(m.group()+",");
            cnt++;
            sum += Integer.parseInt(m.group());
        }
        System.out.println();
        System.out.println("총점:" + sum);
        System.out.println("평균:" + (double)sum/(cnt));






    }
}
