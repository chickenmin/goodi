package chap10;
/*
* 예외처리 : 발생된 예외를 정상화 하는 기능
* - try 블럭
*   - try {  }                   => 예외 발생 가능성 있는 구문
*     catch(예외타입 참조변수) {  } => 예외 발생시 호출되는 블럭
*     finally{  }                => 정상, 예외 꼭 실행 블럭
*
* - throws 선언 : 호출한 메서드로 전송
* 예외 발생 : 정상상태를 예외상태로 변환
*
* - throw 구문 : 예외 강제 발생
*
* */
public class Exception1 {
    public static void main(String[] args) {
        try { //예외 발생 가능성이 있는 구문
            System.out.println(10 / 0);    // ArithmeticException 예외 발생
            System.out.println(args[0]);   // ArrayIndexOutOfBoundsException 예외 발생

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("command 라인에 파라미터 값을 입력하세요.");
        }


    }
}
