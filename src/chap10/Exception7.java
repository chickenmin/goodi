package chap10;
/*
* 예외 처리 생략 가능 예외 클래스 생성
*
*
* 오버라이딩의 조건
* 1. 상속관계
* 2. 부모클래스의 메서드와 자손 클래스 메서드 이름 동일
* 3. 부모클래스의 메서드와 자손 클래스 메서드 매개변수목록 동일
* 4. 부모클래스의 메서드와 자손 클래스 메서드 리턴타입 동일
*       => 부모클래스의 메서드와 자손ㄱ클래스의 선언부 동일
* 5. 접근제어자는 넓은 범위 가능
* 6. 예외처리는 같거나 좁은 범위 가능
* */

class MyException extends RuntimeException{
    MyException(String msg) {
        super(msg);
    }
}
public class Exception7 {
    public static void main(String[] args)  {
        throw new MyException("사용자 예외 발생");

    }
}
