package chap7;
/*
* 다형성 예제
* 1. 자손 클래스의 객체를 부모클래스형의 참조변수로 참조 가능함
* 2. 부모 타입의 참조변수로 자손클래스의 객체 참조시 부모 타입의 멤버들만 접근 가능함
* 3. 오버라이딩된 메서드는 부모타입의 참조변수로 호출 가능함. 최종 오버라이딩 된 메서드가 호출
* 4.모든 클래스의 객체는 Object 객체를 포함한다.
*       = > 모든 클래스의 객체는 object타입으로 참조 가능
*       = > 모든 클래스의 참조변수 타입으로 object 멤버를 호출 가능함
* */
class Bike2{
    int wheel;
    Bike2(int wheel){
        this.wheel = wheel;
    }
    void drive () {
        System.out.println("페달을 밟는다.");
    }

    void stop(){
        System.out.println("브레이크를 잡는다");
    }
}

class EvBike2 extends Bike2 {
    boolean power;
    EvBike2() {
        super(2);
    }
    void power(){
        power = !power;
    }
    void drive() {
        System.out.println("출발 버튼을 누른다");
    }
}
public class BikeEx2 {
    public static void main(String[] args) {
        EvBike2 ev = new EvBike2();
        Bike2 b = null;
        ev.power();
        ev.drive();
        b = (Bike2) ev; // Bike2 형변환 연산자 생략 가능 . 부모클래스의 자료형이 더 큼
         b.drive();
         // b.power;
        Object o = b;
    /*    o.power; //오류
        o.drive; // 오류
        o.stop; //오류
    */
        System.out.println(ev.toString());
        System.out.println(b.toString());
        System.out.println(o.toString());





    }
}
