package chap11;
/*
* Math 클래스
*  - 수치계산관련 메서드 멤버로 가짐. 상수(PI(원주율), E(자연로그)
*  - final 클래스
*  - 생성자의 접근 제한자가  private = > 객체 생성불가.
*       => 모든 멤버가 static 임
* */
public class Math1 {
    public static void main(String[] args) {
//       abs : 절대값
        System.out.println("Math.abs(5): "+Math.abs(5));
        System.out.println("Math.abs(-5): "+Math.abs(-5));

//        ceil, floor, rint : 근사정수 => 가장 가까운 정수
//        ceil : 큰 근사 정수
        System.out.println("Math.ceil(5.4): "+Math.ceil(5.4));
        System.out.println("Math.ceil(-5.4): "+Math.ceil(-5.4));
//        floor : 작은 근사 정수
        System.out.println("Math.floor(5.4): "+Math.floor(5.4));
        System.out.println("Math.floor(-5.4): "+Math.floor(-5.4));
//       rint: 근사 정수
        System.out.println("Math.rint(5.4): "+Math.rint(5.4));
        System.out.println("Math.rint(-5.4): "+Math.rint(-5.4));

//        max(), min() : 최대, 최소
        System.out.println("Math.max(5,4): "+Math.max(5,4));
        System.out.println("Math.min(5,4): "+Math.min(5,4));

//        round() : 반올림 무조건 정수형 전달
        System.out.println("Math.round(5.4): "+Math.round(5.4));
        System.out.println("Math.round(5.5): "+Math.round(5.5));

//        random() : 난수, 임의의 수 0 <= x <1.0
        System.out.println("Math.random(): "+Math.random());
        System.out.println("Math.PI : "+Math.PI);
        System.out.println("Math.E : "+Math.PI);

//        sin(), cos(), tab() : 삼각함수. 라디안 단위
        System.out.println("Math.sin(Math.PI/2: "+Math.sin(Math.PI/2)); //sin(90)
        System.out.println("Math.cos(Math.PI/2: "+Math.cos(Math.PI/2)); //cos(90)
        System.out.println("Math.tan(Math.PI/2: "+Math.tan(Math.PI/2)); //tan(90)

//        라디안 -> 도
        System.out.println("Math.toDegrees(Math.PI): "+Math.toDegrees(Math.PI));
//        도 - > 라디안
        System.out.println( "Math.toRadians(180): "+Math.toRadians(180));
//        sin(90)
        System.out.println("Mah.sin(90도) : "+Math.sin(Math.toRadians(90)));
//      log 함수
        System.out.println("Math.log(Math.E): "+Math.log(Math.E));

//      제곱근
        System.out.println("Math.sqrt(25): "+Math.sqrt(25));
//      제곱
        System.out.println("Math.pow(5,3): "+Math.pow(5,3));
    }
}
