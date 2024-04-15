package test0326;


class Card{
    String kind;
    int number;
    static  int width = 100;
    static int height = 250;
    public String toString() {
        return kind + ":" + number + "("+width + ","+height + ")";
    }
}
public class Test3 {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 1;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 1;

        System.out.println(c1);
        System.out.println(c2);

        Card.width = 100;
        Card.height = 250;

        System.out.println(c1);
        System.out.println(c2);


    }
}
