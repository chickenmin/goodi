package test0328.test2;

public class Biscuit extends  Snack{
    public Biscuit(int price, int gram) {
        super(price, gram);
    }

    @Override
    public String toString() {
        return "비스킷";
    }
}
