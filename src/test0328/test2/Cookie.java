package test0328.test2;

public class Cookie extends Snack{
    public Cookie(int price, int gram) {
        super(price, gram);
    }

    @Override
    public String toString() {
        return "쿠키";
    }
}
