package chap13;

/*
* Collection 인터페이스 : 객체들의 모임
*   List : 추가 순서유지. 인덱스 사용 가능. 가변배열. 구현 클래스 :ArrayList, Vector, LinkedList
*   Set : 중복 불가. 구현 클래스 : HashSet. TreeSet, LinkedHashSet
*   Queue : 구현 클래스 : LinkedList
* Map 인터페이스 : (키, 객체) 쌍들의 모임
*   구현클래스 : HashMap : 순서모름
*              Hashtable : 구버전의 클래스. 구버전의 메서드와 혼합
*              TreeMap : 키 기준으로 정렬됨
*
* 주요 메서드
*   put(키값, 객체값) : map 객체에 데이터 추가, 수정
*   get(키값) : 키값으로 등록된 객체의 값을 리턴
*               등록된 키가 없으면 null로 리턴
*   keySet() :  Map에 등록된 객체중  key값들의 목록을 리턴. Set으로 리턴 (key 값땜에 중복 불가)
*   values() :  Map에 등록된 객체중 객체 값들의 목록을 리턴. Collection으로 리턴
*   entrySet() : Map에 등록된 객체를 (키, 객체)의 쌍인 객체로 리턴. Set으로 리턴 (key 값땜에 중복 불가)
*                  Map.Entry<키, 객체> :  (키, 객체)의 쌍인 객체의 자료형
*   remove(키값) : 키에 해당하는 객체를 제거함. 객체를 리턴함.
* */

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        /*
        * <String,  Integer>
           키의 자료형, 객체의 자료형
           * */
        Map<String,Integer> map = new HashMap<>();
        map.put("홍길동", 1234);
        map.put("김삿갓", 2345);
        map.put("이몽룡", 3456);
        map.put("김삿갓", 4567);
        System.out.println(map);
        System.out.println("김삿갓의 전화번호: "+map.get("김삿갓"));
        System.out.println("홍길순의 전화번호: "+map.get("홍길순"));
//        keySet() : key값드만 조회
        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println(k+"="+map.get(k));
        }
//        values() : 객체값들만 조회. 중복가능, 순서모름. 키값 조회 불가(키로 객체는 가져와도, 객체로 키값 조회는 안댐)
        Collection<Integer> values = map.values();
        for (Integer v : values) {
            System.out.println(v);
        }
//        entrySet() : <키, 객체> 쌍인
//        <키, 객체> 쌍인 객체의 자료형 : Map.Entry
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + "="+e.getValue());
        }

//        홍길동 객체 제거
        Integer value = map.remove("홍길동");
        System.out.println(value);
        System.out.println(map);
        System.out.println("map의 요소의 갯수:"+map.size());

    }
}
