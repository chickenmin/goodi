package test0328.test3;

import com.sun.source.tree.LiteralTree;

public class EastCardDeck {
    EastCard[] cards;

    public EastCardDeck() {
        cards = new EastCard[20];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new EastCard((i%10+1),(( i == 0 || i== 2 || i==7)? true:false) );

        }
    }

    public String toString() {
        String result="";
        for (EastCard card : cards) {
            result += (card + ",");
        }
     return result;


    }
}
