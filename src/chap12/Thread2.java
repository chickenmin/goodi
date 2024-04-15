package chap12;
/*
* Thread 생성 -2
* 1. Runnable 인터페이스 구현
* 2. run 메서드 오버라이딩
* 3. new Thread(Runnable)
* */

//Runnable 인터페이스를 구현한 구현 클래스. Thread 클래스 아님
class Runnable1 implements Runnable {
    @Override
    public void run() { //Running 상태
        for (int i = 1; i <= 5; i++) {
//            Thread.currentThread() : 현재 Running 상태의 스레드 객체
            System.out.println(i+":"+Thread.currentThread().getName());
//            System.out.println(i+":"+getName());  //getName() 멤버가 없음
            try {
                Thread.sleep(1000); //대기상태
            } catch (InterruptedException e) {
            }
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
        System.out.println("main 스레드 실행 시작");
//        t1 스레드가 실행해야 되는 Run메서드는 Runnable1 객체의 run메서드임
        Runnable r = new Runnable1();
        Thread t1 = new Thread(r,"First");    //NEW 상태
        Thread t2 = new Thread(r,"Second");   //new 상태
        t1.start(); //t1 Runnable 상태
        t2.start(); //t2 Runnable 상태
        System.out.println("main 스레드 실행 종료");

    }
}
/*
* new 객체로 스레드가 생성되고
* start 메서드를 해야 실행가능한 준비 Runnable이 발동
* 러너블에서 스케쥴러가 running 실행상태로 데려감
* 러닝에서 SLEEP만나면 대기하고 다시 러너블로 감(러닝X)
* 러너블에서 다시 스케쥴러 통해 러닝상해~ ㄱ러다가 종료(Dead) */