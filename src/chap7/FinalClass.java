package chap7;
/*
final  클래스 : 종단 클래스. 변경불가 클래스. 다른 클래스의 부모 클래스가 될 수 없다.
final 의미 : 변경 불가
String, Math 클래스가 final 클래스임
 */

final class Final{ //다른 클래스의 부모클래스가 안됨
}

//class FinalSub extends Final{ //
//
//}
public class FinalClass {
    public static void main(String[] args) {
        Final f = new Final(); //객체화 가능

    }
}
