package test0328.test2;

public class Apple extends Fruit{
    public Apple(int price, double brix) {
        super(price, brix);
    }

    @Override
    public String toString() {
        return "사과";
    }
}
