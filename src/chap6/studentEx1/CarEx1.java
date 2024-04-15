package chap6.studentEx1;
/*
선언 위치에 따른 변수의 종류
                    선언 위치       선언방법                  메모리 할당시점      메모리 할당 위치
   -클래스 변수      클래스 내부      static 자료형 변수명      클래스 정보 로드시      클래스 영역
    => 객체화 필요 없음. 모든 객체의 공통변수로 사용됨
    => (클래스명.변수명)
    => 기본값으로 초기화
   - 인스턴스변수     클래스 내부      자료형  변수명            객체화시                Heap  영역
   => 객체화 필요,객체별로 다른 메모리 할당
   => (참조변수명.변수명) ex) c1.width;
   => 기본값으로 초기화
   -지역변수        메서드 내부       자료형 변수명            선언문 실행시             Stack 영역
   => 메서드, 블럭 내에서만 사용가능
   => 기본값으로 초기화 안됨. 반드시 초기화 필요함
   => 매개변수는 지역변수
 */


class  Car{
    String color;//인스턴스변수(객체 변수)
    int number;
    static int width = 200; // 클래스변수
    static int height = 120;
    public String toString() {
        return color + ":"+ number + "(" + width + "," + height + ")";
    }
}
public class CarEx1 {
    public static void main(String[] args) { // args : 지역변수
        System.out.println(Car.width + "," + Car.height);
        Car c1 = new Car(); //c1 지역변수
        c1.color = "White";
        c1.number = 1234;
        System.out.println("c1: " + c1.toString());
        Car c2 = new Car();
        c2.color = "Red";
        c2.number = 5678;
        System.out.println("c2: " + c2.toString());
        Car.width = 80;
        Car.height = 50;
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        int num = 0; // 지역변수는 초기화 필요
        System.out.println(num);

        int i;
        boolean b = true;
        if (b) {
            i = 10;
        } else i = 20;
        System.out.println(i);
        int j,k ;
        j = 1;
        switch (j) {
            case 1 : k =10;
            default: k =0;
        }
        System.out.println(k);


    }
}
