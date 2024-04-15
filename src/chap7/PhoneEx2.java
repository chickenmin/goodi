package chap7;
/*
자손 클래스의 객체 생성시 부모 클래스의 객체 생성을 먼저 함
 */
public class PhoneEx2 {
    public static void main(String[] args) {
        SmartPhone2 sp = new SmartPhone2();
        System.out.println(sp.number);

    }
}
