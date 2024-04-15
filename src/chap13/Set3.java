package chap13;

/*
* TreeSet
*
* 정렬됨. 중복 불가
* Set의 하위 인터페이스 SortedSet의 구현 클래스
* */

import java.util.SortedSet;
import java.util.TreeSet;

public class Set3 {
    public static void main(String[] args) {
//        TreeSet<String> set = new TreeSet<>();
//        Set<String> set = new TreeSet<>();
        SortedSet<String> set = new TreeSet<>();
        String from = "bat";
        String to = "d";
        set.add("flower");
        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("azz");
        set.add("car");
        set.add("Car");
        set.add("disc");
        set.add("dance");
        set.add("dzzzz");
        set.add("dZZZZ");
        set.add("elev");
        set.add("fan");
        System.out.println(set);
//        subSet (시작요소, 끝 요소 앞까지) - Set 타입엔 없는 SortedSet의 메서드(정렬값을 기준으로 하기에)
        System.out.println("from:" + from + " ,to:" + to);
        System.out.println(set.subSet(from, to));
        System.out.println("from:" + from + ",to:" + to+"zzzz");
        System.out.println(set.subSet(from,to+"zzzz"));
//        기존의 set을 이용해서 set 객체 생성하기
        TreeSet<String> set2 = new TreeSet<>(set);
        System.out.println(set2);

    }
}
