package chap7;
/*
* 자손 클래스의 객체 생성시 부모 클래스의 객체 생성을 먼저함
* => 자손 클래스의 생성자에서 부모 클래스의 생성자를 호출해야함
*   부모클래스의 매개변수가 없는 생성자가 없다면, 자손 클래스의 생성자에서
*   super(매개변수)를 넣어서 직접 호출해야함
* 부모클래스의 매개변수가 없는 생성자가 있다면, 자손 클래스의 생성자에서
 *   super() 명령문을 생략할 수 있음
 *   생성자는 따로 상속이 안됨!!!
* */

class SmartPhone2 extends Phone2 { //기본생성자

    SmartPhone2 () {
        super(1234); // 부모클래스의 생성자 호출
    }

    void setApp(String name) {
        System.out.println(name + "앱 설치함");

    }
}
