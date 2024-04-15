package test0326;

class Coin{
    int side;
    void flip(){
     side =   (int) (Math.random()*2);
    }
}
public class Test5 {
    public static void main(String[] args) {
        Coin coin = new Coin();
        System.out.println(coin.side == 0 ? "앞면" : "뒷면");
        coin.flip();
        System.out.println(coin.side == 0 ? "앞면" : "뒷면");
    }
}
