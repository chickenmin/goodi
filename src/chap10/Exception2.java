package chap10;
/*
* 다중 catch 구문
*  - 한 개의 try  구문에 여러개의 catch 블럭 존재
*   => try 블럭에서 발생되는 예외 종류에 따라 다른 예외처리가 가능함
*  - 상위예외 클래스(Exception)은 catch 블럭 하단에 배치해야함
*  - (계층적으로 하위클래스부터 먼저 작성해야함)
*
* 예외 클래스 계층
*   Throwable > Error
*             > Exception > RuntimeException > ArithmeticException
*                                              NumberFormatException
*                                              ....
*                           그 외 Exception
*
* Exception 중 RuntimeException(하위 클래스 포함)만 예외처리 생략 가능
* 그 외 Exception은 예외처리가 필수임
* */
public class Exception2 {
    public static void main(String[] args) {
        System.out.print(1);    //try 블럭 외부의 예외발생은 catch 구문이 처리 못함
        try {
            System.out.print(2);
//            System.out.print(3/0);  //ArithmeticException 예외 발생
            System.out.print(3);
            System.out.print(args[0]);    //ArrayIndexOutOfBoundsException 예외 발생
            System.out.println(Integer.parseInt("123"));    //NumberFormatException 예외 발생
            String str = null;
            System.out.println(str.trim()); //NullPointerException 예외 발생
//            int Intgeger.parseInt(문자열) : 문자열을 정수로 변경 함수
            System.out.print(4);
        } catch (ArithmeticException e) {
            System.out.print("=> 0으로 나누지 마세요.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("command 라인에 파라미터를 입력하세요");
        } catch (NumberFormatException e) {
            System.out.println("=>숫자만 입력하세요");
        } catch (Exception e) {
            e.printStackTrace();    // 예외발생 history를 출력
            System.out.println("=> 전산부로 전화 줴요, msg=" + e.getMessage());
        }
        System.out.print(5);
    }
}
