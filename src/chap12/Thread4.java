package chap12;
/*
**/

class SumThread extends Thread{
    int start, end, sum;

    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;

        }
    }
}
public class Thread4 {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(1, 200);
        SumThread t2 = new SumThread(201, 400);
        SumThread t3 = new SumThread(401, 600);
        SumThread t4 = new SumThread(601, 800);
        SumThread t5 = new SumThread(801, 1000);
        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();

//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {}
//       join() : main이 해당 스레드가 종료할때까지 대기 해야함
        try {
            t1.join();  //t1 스레드가 종료할때까지 현재 메서드 (main) 대기
            t2.join();  //t2 스레드가 종료할때까지 현재 메서드 (main) 대기
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
        }

        System.out.println("1~1000까지의 합: " + (t1.sum + t2.sum + t3.sum + t4.sum + t5.sum));
    }
}
