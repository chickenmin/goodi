package chap7;

// SmartPhone 클래스는 Phone  클래스의 하위(자손, 자식, child, sub)클래스
// phone클래스는 SmartPhone클래스의 상위(부모, 조상, super,parent, base) 클래스
public class SmartPhone extends Phone {
    void setApp(String name) {
        System.out.println(name + "앱 설치");
    }
}
