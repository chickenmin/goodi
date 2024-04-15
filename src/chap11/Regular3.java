package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular3 {
    public static void main(String[] args) {
        String source = "핸드폰:010-1111-1111, 집:02-123-45678" + "이메일:regular111@aaa.bbb, 계좌번호:301-01-123456"+"이메일2:111regular@bbb.ccc";
         String telPattern = "(0[0-9]{1,2})-(\\d{3,4})-(\\d{4})";
        Pattern p = Pattern.compile(telPattern);
        Matcher m = p.matcher(source);
        int i = 0;
        System.out.println("전화번호====");
        while (m.find()) { //문자열 내에서 우리가 지정한 패턴에 맞는 문자열을 검색
            System.out.println(++i +":"+m.group()+"=>"+m.group(1) + ","+m.group(2)+","+m.group(3));
        }
        System.out.println("이메일====");
        i = 0;
        String emailPattern = "(\\w+)@(\\w+).(\\w+)";
        p = Pattern.compile(emailPattern);
        m = p.matcher(source);
        while (m.find()) { //문자열 내에서 우리가 지정한 패턴에 맞는 문자열을 검색
            System.out.println(++i +":"+m.group()+"=>"+m.group(1) + ","+m.group(2)+","+m.group(3));
        }

        System.out.println("계좌번호====");
        i = 0;
        String accountPattern = "(\\d{3})-(\\d{2})-(\\d{6})";
        p = Pattern.compile(accountPattern);
        m = p.matcher(source);
        while (m.find()) { //문자열 내에서 우리가 지정한 패턴에 맞는 문자열을 검색
            System.out.println(++i +":"+m.group()+"=>"+m.group(1) + ","+m.group(2)+","+m.group(3));
        }

    }
}
