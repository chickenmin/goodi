package chap13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
* Collection : 객체들의 모임. 콜렉션 자체도 객체임
*  List : 순서유지. 인덱스 사용. 가변배열
*         구현클래스 => ArrayList, Vector, LinkedList
*  Set : 중복 불가. 인덱스 사용 불가
*         구현 클래스
*      => HashSet : 중복 불가. 순서모름
*         TreeSet : 중복 불가. 정렬함
*         LinkedHashSet : 중복 불가. 순서 유지. 인덱스 사용 안됨
*
* set의 주요 메서드
*  boolean add(Object) : 추가 성공(true). 추가 실패(false)
*
*
* */
public class Set1 {
    public static void main(String[] args) {
        Object[] arr = {"홍길동", 1, "1", "김삿갓", "이몽룡", "홍길동", "성춘향", "향단이", "홍길동", "김삿갓"};
//        Set<Object> set1 = new HashSet<>();
        Set<Object> set1 = new LinkedHashSet<>(); //순서 유지
        Set<Object> set2 = new HashSet<>();
        Set<Object> set3 = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set1.add(arr[i])) {
                if (!set2.add(arr[i])) {
                    set3.add(arr[i]);
                }
            }
        }

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
//        개선된 for 구문으로 조회 가능
        for (Object o : set1) {
            System.out.println(o);
        }

    }
}
