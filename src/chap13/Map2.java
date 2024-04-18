package chap13;

import java.util.*;

class EastCard{
    final int num;
    final boolean isKwang;

    public EastCard(int num, boolean isKwang) {
        super();
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public String toString() {
        return num + ((isKwang)?"K":"");
    }
}

class CardDeck { //카드묶음
    List<EastCard> cards;
    static Map<String,Integer> jokbo;
    static {
        jokbo = new HashMap<>();
        jokbo.put("KK", 4000);
        for (int i = 1; i <= 10; i++) {
            jokbo.put(""+i+i,3000+(i*10));
        }

        jokbo.put("12", 2060);
        jokbo.put("21", 2060);
        jokbo.put("14", 2050);
        jokbo.put("19", 2040);
        jokbo.put("91", 2040);
        jokbo.put("110", 2030);
        jokbo.put("101", 2030);
        jokbo.put("410", 2020);
        jokbo.put("104", 2020);
        jokbo.put("46", 2010);
        jokbo.put("64", 2010);
    }

    CardDeck() {
        cards = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            cards.add(new EastCard(i%10+1, ((i==0||i==2||i==7)?true:false)));
        }
        System.out.println(cards);
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println(cards);
    }

    public EastCard pick(int i) {
        return cards.remove(i);
    }
}
/*
* plalyer  클래스*/

class Player implements Comparable<Player> {
    String name;
    EastCard card1, card2;

    public Player(String name, EastCard card1, EastCard card2) {
        super();
        this.name = name;
        this.card1 = card1;
        this.card2 = card2;
    }

    //        족보 = 족보 점수  // 족보x = (card.num + card.num)%10 리턴
    int getScore() {
        Integer score = 0;
        if (card1.isKwang && card2.isKwang) {
            score = CardDeck.jokbo.get("KK");
        }else {
            score = CardDeck.jokbo.get("" + card1.num + card2.num);
            if (score == null) { //족보에 없는 카드
                score = (card1.num+ card2.num) %10;
            }
        }

        return score;

    }

    public String toString() {
        return name +"(" + card1+","+card2+"):" + getScore();
    }

    @Override
    public int compareTo(Player o) {
        return getScore() - o.getScore();
    }
}
public class Map2 {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.shuffle();
        List<Player> list = new ArrayList<>();
        list.add(new Player("홍길동",deck.pick(0),deck.pick(0)));
        list.add(new Player("김삿갓",deck.pick(0),deck.pick(0)));
        list.add(new Player("이몽룡",deck.pick(0),deck.pick(0)));
        for (Player p : list) {
            System.out.println(p);
        }
        System.out.println("deck에 남은 카드 갯수:"+deck.cards.size());
        Collections.sort(list,(p1,p2)->p2.getScore() - p1.getScore());
        System.out.println(list);
        if (list.get(0).getScore() == list.get(1).getScore()) {
            System.out.println(list.get(0).name + ","+list.get(1).name+" 비김");
        } else {
            System.out.println(list.get(0).name + "승리");
        }




/*
* PLAYER 중 점수가 가장 높은 사람이 승리함
* 1등의 이름 출력하기
* 예 ) 홍길동 승리
* 1등이 2명인 경우 : 홍길동, 김삿갓 비김*/


    }
}
