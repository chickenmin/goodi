package chap13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exam4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("대한민국", "서울");
        map.put("캐나다", "오타와");
        map.put("영국", "런던");
        System.out.println("나라 이름을 입력하세요");

        Scanner sc = new Scanner(System.in);
        while (true) {
            String country = sc.next();
            if (country.equals("종료")) {


                System.out.println("종료함");
                break;
            }
            String city;
            if (map.get(country) == null) {
                System.out.println("등록된 나라가 아닙니다.\n수도를 입력하세요");
               city = sc.next();
                map.put(country,city);
            } else  {
                System.out.println(country + "=" + map.get(country));

            }
        }
        Set<String> key = map.keySet();
        System.out.println("keySet");
        for (String s : key) {
            System.out.println(s + ":" + map.get(s));
        }

        System.out.println("EntrySet");
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + ":" +e.getValue());
        }
    }
}
