package chap11;
/*
* Object 클래스 : hashCode 메서드
*  hashCode : 원래 의미는 JVM 객체를 구별하기위한 고유의 값(참조값)
*             두 객체의 해쉬코드 값이ㅣ 동일한 경우는 같은 객체로 볼 수 있다.
*
*       물리적 같은 객체 : 실제로 같은 객체인 경우
*       논리적 같은 객체 : 내용 기준을 같은 객체로 판단해야할 경우
*                         - a.equals(b) : 결과가 참 => a와 b 객체의 내용이 같다
*                         - a.hashCode() == b.hashCode() => a와 b 객체가 같은 객체로 판단
*
* 권장 사항
*  - equals 메서드를 오버라이딩 하는 경우 hashCode 메서드도 같이 오버라이딩 하도록 권장
*  */
public class Object2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println("s1 == s2 :" + (s1==s2));    //false
        System.out.println("s1.equals(s2):" + (s1.equals(s2))); //true
        System.out.println("s1.hashCode():" + s1.hashCode());   //오버라이딩됨
        System.out.println("s2.hashCode():" + s2.hashCode());
        System.out.println("s1 객체의 원래 hashcode 값:" + System.identityHashCode(s1));
        //equals와 hashCode 메서드는 주로 오버라이딩 되기때문에 진짜 해시값을 알고 싶을땐 시스템메소드 사용
        System.out.println("s2 객체의 원래 hashcode 값:" + System.identityHashCode(s2));

        Equal e1 = new Equal(10);
        Equal e2 = new Equal(10);
//      Equal 클래스에 hashCode 메서드 내용이 같은 경우 같은 hashCode값을 리턴하도록 오버라이딩
        System.out.println("e1.hashCode():" + e1.hashCode() );
        System.out.println("e2.hashCode():" + e2.hashCode() );
    }
}
