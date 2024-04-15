package chap6;

import java.sql.SQLOutput;

class Car2 {
    String color; //객체화시 변수가 됨 = >인스턴스변수
    int num;
    int sno;
    static int cnt; //클래스 변수
    //객체를 문자열화 하는 메서드
    public String toString(){
        return "자동차번호: " + sno + "=>" + color + "," + num + "자동차생산 갯수: " + cnt;

    }
}
public class StaticValEx1 {
    public static void main(String[] args) {
        Car2 c1 = new Car2(); // main 메소드 안에서만 사용이 가능한 변수 = > 지역변수
        c1.color = "White";
        c1.num = 1234;
        c1.sno = ++Car2.cnt;
        System.out.println(c1);
        Car2 c2 = new Car2();
        c2.color = "Black";
        c2.num = 5678;
        c2.sno = ++Car2.cnt;
        System.out.println(c1); // 참조변수 출력시 toString() 메서드 호출함
        System.out.println(c2);

        for (int i = 0; i < 10; i++) { // for 구문 내부에서만 사용이 가능한 변수 => 지역변수
            System.out.println(i);
        }

    }



}
















