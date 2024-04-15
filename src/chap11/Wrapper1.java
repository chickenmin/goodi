package chap11;
/*
* Wrapper 클래스 : 8개의 기본자료형을 객체화하기 위한 클래스 통칭
*           => 8개의 클래스를 통칭
*
*
* 기본자료형     Wrapper 클래스
* boolean       Boolean
* char          Character
* byte          Byte
* short         Short
* int           Integer
* long          Long
* float         Float
* double        Double
*
* 참조 자료형 기본자료형간에 형변환 불가
*   String str = 'A'; (X)
* 단, 기본자료형을 담당하고 있는 WRAPPER 클래스 간에는 자동변환 가능
*
* Character ch1 = 'A'; auto Boxing 됨
* char ch2 = new Character('A'); auto unBoxing됨
*
* */
public class Wrapper1 {
    public static void main(String[] args) {
//        String str = 'A'; // char -> String 형변환 불가
        Character ch1 = 'A'; // 기본자료형 -> 참조자료형 auto Boxing
//        deprecated : 이전버전에서 사용 가능 . 현재 버전에서는 가능하면 사용하지 않도록 표현
        char ch2 = new Character('A'); // 참조자료형 -> 기본자료형 auto unBoxing
    }
}
