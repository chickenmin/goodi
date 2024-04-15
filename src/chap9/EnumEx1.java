package chap9;
/*
* 열거형 객체*/

public class EnumEx1 {
    public enum Car{
        AVANTE, SONATA, GRANDEUR, SM5, K7 //미리 객체를 생성하여 설정
    }
    public static void main(String[] args) {
        Car car = Car.AVANTE;
        System.out.println(car); //객체의 이름
        System.out.println(Car.K7); //객체의 이름
        Car[] cars = Car.values(); // values() : 저장되어 있는 객체의 목록을 배열로 리턴
        for (Car c : cars) {
            System.out.println(c + ":" + c.ordinal());
        }

        System.out.println();
    }
}
