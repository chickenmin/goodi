package chap7;

/*
* 추상 클래스
* 1. 추상클래스를 멤버로 가질 수 있는 클래스 => abstract 예약어 사용함
* 2. 객체화 불가 => 상속으로 자손 클래스의 객체화로 객체화 가능
* 3. 그 외 일반 클래스와 동일 (생성자, 멤버 변수, 멤버 메서드, 초기화 블록 , 상속 가능...)
*
* 추상 메서드
* 1. 메서드의 선언부만 존재. 구현부{}가 없음 => abstract 예약어 사용함
* 2. 자손 클래스에서 반드시 오버라이딩 해야함
* */

abstract class Shape{ //추상클래스
    String type;

    public Shape() {
    }

    Shape(String type) {
        this.type = type;
    }
    abstract double area(); // 추상메서드 : 하위 클래스에서 반드시 오버라이딩 필요
    abstract double length();

    public String toString(){
        return type+":";
    }

}


class Circle extends Shape{
    int r;
    public Circle(int r) {
        super("원형");
        this.r = r;
    }

    @Override
    double area() {
        return r*r*Math.PI;
    }

    @Override
    double length() {
        return 2*r*Math.PI;
    }



}

class Rectangle extends Shape{
    int width, height;

    public Rectangle(int width, int height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width*height;
    }

    @Override
    double length() {
        return (width+height)*2;
    }


}











public class AbstractEx1 {
    public static void main(String[] args) {
        //추상클래스 객체화 불가
       // Shape s = new Shape("도형");

        Shape[] sArr = new Shape[2];
        sArr[0] = new Circle(10);
        sArr[1] = new Rectangle(10, 10);
        int toL = 0 ,toA = 0;
        for (Shape s : sArr) {

            toL += s.length();
            toA += s.area();
        }
        System.out.println(toA);
        System.out.println(toL);


//        for (Shape s : sArr) {
//            if (s instanceof Circle) {
//                System.out.println(((Circle) s).type + ": 가로=" +
//                        ((Circle) s).r*2 + ",세로= " + ((Circle) s).r*2 + ", 면적 = " + s.area() + "둘레 =" + s.length());
//
//            } else if (s instanceof Rectangle) {
//                System.out.println(((Rectangle) s).type + ": 가로=" +
//                        ((Rectangle) s).width + ",세로= " + ((Rectangle) s).height+ ", 면적 = " + s.area() + "둘레 =" + s.length());
//            }
//        }

        if (sArr[0] instanceof Circle) {
            Circle c = (Circle) sArr[0];
            System.out.println("반지름=" + c.r);
        }

    }
}









