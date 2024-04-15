package chap7;
/*
* final 변경 불가의 의미
* final 변수 : 변경 불가 변수. 상수
*           상수값의 이름 규칙 : snake방식 _사용*/

class FinalValue{
    final int NUM; //명시적 초기화가 되지 않으면 생성자에서 한번은 초기화 가능
    static final int MAX;
    static {
        MAX = (int)(Math.random()*100);
    }
   public FinalValue(int num){
        NUM = num; // 객체 별로 다른 상수 값을 가질 수 있도록 생성자에서 초기화
    }
}
public class FinalValueEx1 {
    public static void main(String[] args) {
        final int NUM = 100;
        //NUM = 200; // 상수 : 변경불가 변수

        final int MAX; // 초기화 하지 않으면 한번은 초기화 가능함
        MAX = 200; // 한번은 초기화 가능
        //MAX = 300; // 두번 안됨

        FinalValue fv1 = new FinalValue(10);
        FinalValue fv2 = new FinalValue(20);
        System.out.println(fv1.NUM);
        System.out.println(fv2.NUM);
//        fv1.NUM =100; //초기화된 경우 변경불가
//        fv2.NUM =100; //초기화된 경우 변경불가

        final int[] arr = {10, 20, 30, 40, 50}; //배열의 값이 상수라는 것이 아니라, 배열 arr의 참조값이 변할 수 없다는 것이다.
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
        arr[0] = 100;
        arr[1] = 200;
        for (int i : arr) {
            System.out.print(i + ",");
        }

//        arr = new int[]{100, 200, 300}; // arr 참조변수에 새로운 객체 참조 불가함
    }
}
