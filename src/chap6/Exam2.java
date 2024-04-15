package chap6;

class Rectangle3{
    int width, height, sno;
    static int cnt;

    public Rectangle3(int a, int b) {
        width = a;
        height = b;
        sno = ++cnt;
    }
    int area() {
        return width*height;
    }

    int length() {
        return (width+height)*2;
    }

    boolean isSqaure() {
        return width == height;
    }

    public String toString() {
        return sno + "번 사각형 =>(" + width +"," + height + "), 넓이:" + area() +", 둘레: " + length() + "," +
                (isSqaure() ? "정사각형":"직사각형" )+ ", 생성된 사각형 갯수: " + cnt ;
    }



}
public class Exam2 {
    public static void main(String[] args) {
        Rectangle3 r = new Rectangle3(10, 20);
        System.out.println(r);
    }
}
