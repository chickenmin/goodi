package test0412;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("자연수를 입력하세요 종료(0)");
        List<Integer> set = new ArrayList<>();
        int num, sum = 0, max, min;

        try {
            while (true) {
                num = sc.nextInt();
                if (num == 0) {
                    break;
                }
                if (num %2 ==1) {
                    set.add(num);
                }
            }
        } catch (InputMismatchException e) {
            sc.next();
        }

        max = Collections.max(set);
        min = Collections.min(set);
        double mid;
        int s = set.size();
        if (s % 2 == 0) {
            mid = (set.get((s/2)-1) + set.get(s/2))/2;
        } else mid = set.get(s/2);

        for (Integer i : set) {
            sum += i;
        }
        System.out.print(set);
        System.out.print("의 합: " + sum+"\n");
        System.out.println("홀수의 최대값:" + max + "\n홀수의 최소값:"+min);
        System.out.println("홀수의 최대값 위치: " + set.indexOf(max) + "\n홀수의 최소값 위치: "+set.indexOf(min));
        System.out.println("입력된 홀수 목록:" + set);
        System.out.println("중간값: " + mid);

    }
}
