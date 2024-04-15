package chap8;
/*
* LambdaInterface1 을 이용하여 1~100까지의 짝수의 합과 홀수의 합을 출력하기*/
public class Exam1 {
    public static void main(String[] args) {

        LambdaInterface1 f1 = new LambdaInterface1() {
            @Override
            public void method() {
                int sumEven = 0, sumOdd =0;
                for (int i = 0; i <= 100; i++) {
                    if (i % 2 == 0) {
                        sumEven += i;
                    } else {
                        sumOdd += i;
                    }
                }
                System.out.println("익명객체 짝수 합" + sumEven);
                System.out.println("익명객체 홀수 합" + sumOdd);
            }
        }; // 익명객체
        f1.method();

        //LambdaInterface1 f2
        f1= () -> {
            int sumEven = 0, sumOdd =0;
            for (int i = 0; i <= 100; i++) {
                if (i % 2 == 0) {
                    sumEven += i;
                } else {
                    sumOdd += i;
                }
            }
            System.out.println("람다 짝수 합" + sumEven);
            System.out.println("람다 홀수 합" + sumOdd);

        };
        f1.method();




    } //main
}
