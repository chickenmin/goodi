package test0327;

public class Test5 {
    public static void main(String[] args) {
       Coin myCoin = new Coin();
       Coin youCoin = new Coin();
       int myCnt =0, youCnt = 0;
        System.out.println("myCoin\tyouCoin");
        while (myCnt <3 &&youCnt <3) {
            myCoin.flip();
            youCoin.flip();
            if (myCoin.side == 0) {
                myCnt++;
            } else myCnt = 0;
            if (youCoin.side == 0) {
                youCnt++;
            } else youCnt=0;

            System.out.println(
                    (myCoin.side == 0? "앞면" : "뒷면") +"\t\t"+ (youCoin.side == 0? "앞면" : "뒷면")
            );
        }

        if (myCnt == youCnt) {
            System.out.println("비김");
        } else if (myCnt == 3) {
            System.out.println("myCnt 승리");
        } else System.out.println("youCnt 승리");

    }
}
