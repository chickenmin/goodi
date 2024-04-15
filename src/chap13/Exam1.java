package chap13;

import java.util.*;

public class Exam1 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("홀수개의 숫자를 입력하세요(종료:999)");
        List<Integer> list = new ArrayList<>();
        int a;

        while (sc.hasNext()) {
            a = sc.nextInt();
            list.add(a);
            if (a == 999) {
                break;
            }

        }
        System.out.println(list);
        Collections.sort(list);

        if (list.size() % 2 == 0) {
            list.remove(list.size() - 1);
        }
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("평균: " + sum/list.size());
        System.out.println("중간값: " + list.get(list.size()/2));*/

        Scanner sc = new Scanner(System.in);
        System.out.println("홀수개의 숫자를 입력하세요(종료:999)");
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        while (true) {
            int num = sc.nextInt();
            if (num == 999) {
                break;
            }
            list.add(num);
        }
//        입력갯수 홀수인지 검증
        if (list.size() % 2 == 0) {
            list.remove(list.size()-1); //마지막 요소 제거
        }
        System.out.println(list);
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("평균:" + (double)sum/list.size());
        Collections.sort(list); //list 정렬하기
        System.out.println(list);
        System.out.println("중간값: " + list.get(list.size()/2));



    }
}
