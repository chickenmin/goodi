package chap13;

import java.util.Vector;

/*
* Vector 클래스
* - Collection 프레임워크 이전의 클래스
* - List 인터페이스의 구현클래스
* - 구버전의 메서드와 List 인터페이스의 메서드가 공존
*
* List 인터페이스 객체 특징
* - 추가(add)한 순서를 유지
* - 인덱스(첨자) 사용
* */


public class List2 {
    public static void main(String[] args) {
        Vector<Double> list = new Vector<>();
//        List<Double> list = new Vector<>();
        list.add(0.3);
        list.add(Math.PI);
        list.addElement(5.0);   //구버전 메서드. List.add() 동일한 기능
        System.out.println(list);
//        요소의 위치 찾기
        double num = 5.0;
        int index = list.indexOf(num);
        if (index < 0) {    //index => String 클래스의 위치찾기뢍 동일
            System.out.println(num + "은 list의 요소가 아닙니다 " + index);
        } else System.out.println(num + "의 위치 :"+index);    //5.0의 위치 :2

//        contains() : 요소가 존재?
        if (list.contains(num)) {
            System.out.println(num + "은  list의 요소임");
        } else System.out.println(num + "은  list의 요소아님");   //5.0은  list의 요소임

//        remove() :요소 제거. 제거값 리턴
//        remove(Object) : 요소 값을 제거
//        remove(int) : 인덱스에 해당하는 요소 제거
//        => Integer 객체할 때 조심
        System.out.println(list.get(0));    //0.3
        list.remove(0.3);       //0.3을 제거
        System.out.println(list);       //[3.141592653589793, 5.0]
        System.out.println(list.get(0));    //기존의 0번 인덱스 (0.3)이 제거되고 Math.PI(기존 1번 인덱스) 가 0번 인덱스로 땡겨짐
        System.out.println(list.remove(0)); //math.pi
        System.out.println(list);


    }
}
