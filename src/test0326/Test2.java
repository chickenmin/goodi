package test0326;

public class Test2 {
    public static void main(String[] args) {
        int data = 55;

        int[][] result = new int[10][];

        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
        } // 열 생성

        for (int i = 0; i < result.length; i++) { // 수 대입
            for (int j = result.length-1 ; j >= i; j--) {
                result[j][i] = data--;
            } //j
        }//i

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.printf("%3d",result[i][j]);
            }
            System.out.println();

        }
}
}

