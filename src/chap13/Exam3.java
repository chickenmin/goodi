package chap13;

import java.util.Random;
import java.util.TreeSet;

public class Exam3 {
    public static void main(String[] args) {
        TreeSet<Integer> lotto = new TreeSet<>();
/*

        do {
            lotto.add((int)(Math.random()*45)+1);
        } while (lotto.size() != 6);

        System.out.println(lotto);
*/
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        while (lotto.size() < 6) {
            lotto.add(rand.nextInt(45) + 1);
        }
        System.out.println(lotto);
    }
}
