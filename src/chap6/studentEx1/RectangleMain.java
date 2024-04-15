package chap6.studentEx1;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.height =5;
        r1.width = 10;

        r1.area();
        r1.length();

        Rectangle r2 = new Rectangle();
        r2.height =10;
        r2.width = 10;

        r2.area();
        r2.length();

        System.out.println(r1.toString());
    }
}
