package test0327;
class Circle{
    int num;
    int r;
    static int cnt;

    public Circle(int r) {
        this.r = r;
        num = ++cnt;
    }

    double area() {
        return Math.PI * r*r;
    }
    double length() {
        return Math.PI *2*r;
    }

    void scale(double m) {
        r *= m;
    }

    public String toString() {
        return num + "번원 : 반지름:" + r + ", 넓이:" + area()
               + ", 둘레: " + length();
    }
}
public class Test4 {
    public static void main(String[] args) {
        Circle[] carr=new Circle[3];
        carr[0] = new Circle(100);
        carr[1] = new Circle(10);
        carr[2] = new Circle(1);
        for(Circle c : carr) {
            System.out.println(c);
            System.out.println("scale 후");
            c.scale(3);
            System.out.println(c);
        }
    }

}
