package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* 정규 표현식 : 문자의 형식을 지정하는 기능
* */
public class Regular1 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.",
                "car", "combat", "count", "cTT", "data", "disk", "c"};
        /*
        * 패턴 : 문자열의 형식을 지정
         * c[A-Za-z] : c로 시작하고, 뒤에 영문자(대소문자)가 한개 있는 문자
        * c[A-Za-z]? : c로 시작하고, 뒤에 영문자(대소문자)가 한개 또는 없는 문자
        * c[A-Za-z]+ : c로 시작하고, 뒤에 영문자(대소문자)가 한개 이상 있는 문자
        * c[A-Za-z]* : c로 시작하고, 뒤에 영문자(대소문자)가 0개 이상 있는 문자
        * c : 첫번째 문자는 c
        * [A-Za-z] : 중괄호는 옵션 . 대문자 또는 소문자
        * ? : 0또는 1
        * + : 1개 이상
        * * : 0개 이상
        * */
        Pattern p = Pattern.compile("c[A-Za-z]?");
        for (String s : data) {
            Matcher m = p.matcher(s); //패턴 형식 검증
            if (m.matches()) { // 설정 패턴 일치 여부 검증. 일치:true, 불일치:false
                System.out.print (s+",");
            }
        }
        System.out.println();
        String names = "홍길동  ,  김삿갓,  이몽룡, 성춘향,  임꺽정, 향단이    ";
//        \s* => 공백 0개 이상
//        \s : 공백 1개
        String[] arr = names.trim().split("\\s*,\\s*");
        for (String s : arr) {
            System.out.println("===="+s+"====");
        }
    }
}
