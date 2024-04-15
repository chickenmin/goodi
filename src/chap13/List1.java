package chap13;

import java.util.*;

/*
* List 인터페이스
* 1. 순서를 유지
* 2. 인덱스(첨자) 가능
* 3. 구현 클래스 :ArrayList, Vector, LinkedList 등
* */
public class List1 {
    public static void main(String[] args) {
//        <Integer> : 제네릭.
//                   요소 (Element)의 자료형 지정

//      List<Integer> list = new ArrayList<>(); //jdk 8.0 이후에서만 꺽쇠 안 객체 생략 가능
//      List<Integer> list = new ArrayList<Integer>(); //jdk 8.0 이전은 생략 불가
//      List<Integer> list = new Vector<>();
      List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(0);
//      list.add("5");    //Integer 객체만 저장 가능
        System.out.println(list);
//        list.size() : 저장된 요소의 개수 (length 마냥)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+":"+ list.get(i));
        }

//        개선된 FOR 문 가능
        for (Integer i : list) {
            System.out.println(i);
        }
//      정렬하기
//        Collections : 클래스. Collection 객체들의 보조 기능 수행
//        Collection : 인터페이스. List,Set 상위 인터페이스
//        sort() : 정렬하기
        System.out.println("오름차순 정렬");
        Collections.sort(list);   //list 객체 정렬
        System.out.println(list);

        System.out.println("내림차순 정렬");
        Collections.sort(list,Comparator.reverseOrder());   //list 객체 정렬
        System.out.println(list);

//        shuffle : 객체를 임의의 순서로 섞기
        System.out.println("요소들을 섞기");
        Collections.shuffle(list);
        System.out.println(list);
//         subList(시작인덱스,종료인덱스+1) : 부분리스트
//        subList(1,4) : 1번부터 3번 인덱스까지를 부분리스트로 리턴
        System.out.println("부분리스트");
        List<Integer> list2 = list.subList(1, 4);
        System.out.println(list2);
        list.set(1, 100);   //1번 인덱스 값을 100으로 변경
        System.out.println(list);
        System.out.println(list2);

      List<Integer> list3 = new ArrayList<>(list.subList(1, 4));
      System.out.println(list3);
      list.set(2,200);
      System.out.println(list);
      System.out.println(list2);
      System.out.println(list3);

    }
}
















