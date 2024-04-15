package test0328.test3;

public class EastCard {
    int num;
    boolean isKwang;

    public EastCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return (num +(isKwang?"k":""));
    }
}