package test0327;

class Coin {
    int side, sno;
    static int cnt, front, back;

    public Coin() {
        sno = ++cnt;
    }

    void flip() {
        side = (int) (Math.random() * 2);
        if (side == 0) {
            front++;
        } else back++;
    }

    public String toString() {
        flip();
        return sno + "번 동전 :" + (side == 0 ? "앞면" : "뒷면");

    }
}

public class Test2 {
    public static void main(String[] args) {
        Coin [] coins = new Coin[10];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = new Coin();
        }
        for (Coin coin : coins) {
            System.out.println(coin.toString());
        }
        System.out.println("전체 앞면 동전의 갯수 :"+Coin.front +"\n전체 뒷면 동전의 갯수"+Coin.back);

    }
}

