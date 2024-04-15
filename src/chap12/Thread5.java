package chap12;

public class Thread5 {
    public static void main(String[] args) throws InterruptedException {
        SumThread[] arr = new SumThread[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new SumThread(i*200+1, (i+1)*200);
            arr[i].start();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].join();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].sum;
        }
        System.out.println("1~1000까지의 합: "+sum);
    }
}
