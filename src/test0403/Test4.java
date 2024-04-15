package test0403;
/*
 *  LambdaInterface를 이용하여 사용하여 1부터100까지의 임의의 수 10개를
 *  배열에 저장하고, 그중 짝수,홀수 를 구분하여 출력하고,
 *  짝수의 합과 홀수의 합을 출력하는 프로그램 작성하기
 *  [결과]
    3,73,83,40,52,45,43,33,26,6,
    홀수 :3,73,83,45,43,33,=280
    짝수 :40,52,26,6,=124
 */
interface LambdaInterface {
    boolean method(int a);
}
public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.print(arr[i] + ",");
        }
        System.out.println();

        LambdaInterface p = (a) -> {
            if ((a%2) == 1) {
                return true;
            }
            return false;
        };
        System.out.print("홀수 :");
        numlist(p,arr);
        System.out.print("짝수 :");

        p = (a) -> {
            if ((a%2) == 0) {
                return true;
            }
            return false;
        };

        numlist(p,arr);
    }

    private static void numlist(LambdaInterface p, int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (p.method(i)) {
                System.out.print(i + ",");
                sum += i;
            }//if
        }//for
        System.out.println("=" + sum);

    }
}
