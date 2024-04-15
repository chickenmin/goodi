package chap11;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays1 {
    public static void main(String[] args) {
        String[] arr = {"홍길동", "이몽룡", "성춘향", "향단이"};
        for (String s : arr) {
            System.out.print(s+",");
        }
        System.out.println();

        Arrays.fill(arr, "김길동");
        for (String s : arr) {
            System.out.print(s+",");
        }
        System.out.println();
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
//        arr배열 1,2 인덱스의 값만 홍길동전으로 바꿔보자
        Arrays.fill(arr, 1, 3, "홍길동전");
        System.out.println(Arrays.toString(arr));
//        arr배열의 값을 정렬하기 : 오름차순
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//      내림차순
        Arrays.sort(arr, Comparator.reverseOrder()); //내림차순
        System.out.println(Arrays.toString(arr));

//      arr 배열 복사
        String[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        arr2[1] = "이몽룡";
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        int[] numarr = new int[100];
        Arrays.fill(numarr,10);
        System.out.println(Arrays.toString(numarr));

    }
}
