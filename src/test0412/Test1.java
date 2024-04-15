package test0412;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Random rand = new Random();

        while (set.size() < 6) {
            set.add(rand.nextInt(1000)+1);
        }

        List<Integer> list = new ArrayList<>(set);



        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.println("3등 복권 추첨합니다.");
            } else if (i== 3) {
                System.out.println("2등 복권 추첨합니다.");
            } else if (i == 5) {
                System.out.println("1등 복권 추첨합니다.");
            }
            System.out.println(list.get(i));
        }//for

        System.out.println("복권 추첨 결과");
        for (int i = list.size()-1; i > -1; i--) {
            if (i == 5) {
                System.out.print("1등: ");
            } else if (i== 4) {
                System.out.print("2등: ");
            } else if (i == 2) {
                System.out.print("3등: ");
            }
            System.out.print(list.get(i)+",");
            if (i == 5 || i == 3 || i == 0) {
                System.out.println();
            }
        }


    }
}
