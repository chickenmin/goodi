package chap13;

import java.util.*;

/*
* Iterator 인터페이스 : 반복자
*  Collection 객체를 Iterator 인터페이스의 객체로 변경 가능함 => iterator() 메서드 이용
*
* 멤버 메서드
*   boolean hasNext() : 조회 가능한 객체 존재?
*   Object next() : 객체 조회 리턴
*   void remove() : 조회된 객체를 제거. next() 실행 후 호출해야함
*
* Enumeration 인터페이스 : Iterator 이전에 사용되던 반복자
*                       Vector, Hashtable만 사용 가능함.
*
* 멤버메서드
*   boolean hasMoreElement() : 조회 가능한 객체 존재?
*   Object nextElement() : 객체를 조회하여 리턴
* */
public class Iterator1 {
    public static void main(String[] args) {
        Iterator<Integer> it = null;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i + 10);
            set.add(i * 10);
        }

        System.out.println(list);
        System.out.println(set);
        it = list.iterator();   //Iterator 객체로 변경
        printremove(it);
        it = set.iterator();
        printremove(it);
        System.out.println("printremove 후 list:"+list);
        System.out.println("printremove 후 set:"+ set);
    }

    private static void printremove(Iterator<Integer> it) {
        while (it.hasNext()) {
            System.out.println(it.next());  //11
//            it.remove();    //next() 리턴된 객체 제거

        }
    }
}
