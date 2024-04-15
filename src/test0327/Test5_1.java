package test0327;

public class Test5_1 {
    public static void main(String[] args) {
        Coin myCoin = new Coin();
        Coin youCoin = new Coin();

        int myC = 0;
        int youC = 0;
        System.out.println("myCoin\tyouCoin");

        while (myC <3 && youC < 3) {
            myCoin.flip();
            youCoin.flip();
            System.out.print(myCoin.side ==0 ? "앞면":"뒷면");
            System.out.print("\t");
            System.out.print(youCoin.side ==0 ? "앞면":"뒷면");
            System.out.println();
            if (myCoin.side == 0) {
                myC++;
            } else {
                myC = 0;
            }
            if (youCoin.side == 0) {
                youC++;
            } else {
                youC = 0;
            }

        }

        if (youC == myC) {
            System.out.println("비김");
        } else if (myC == 3) {
            System.out.println("myCoin 이김");
            
        }  else {
            System.out.println("youCoin  이김");
        }
    }
}
