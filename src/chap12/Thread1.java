package chap12;
/*
* Thread 생성
* 1. Thread 클래스 상속
* 2. run() 메서드 오버라이딩 : 스레드가 실행을 해야하는 기능
* */

class Thread_1 extends Thread{
    Thread_1(String name) {
        super(name); //Thread 이름 설정
    }

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i+":"+getName());

            try {
                sleep(1000);    //1000밀리초=1초 동안 대기하라는 메서드
            } catch (InterruptedException e) {

            }
        }
    } //run 메서드 종료. Dead 상태. 종료상태
}
public class Thread1 {
    public static void main(String[] args) {
        System.out.println("main  스레드 시작");
        Thread t1 = new Thread_1("First");
        Thread t2 = new Thread_1("Second");
        t1.start();
        /*
        * start 메서드 기능
        * 1. 스택 영역을 병렬화
        * 2. run() 메서드 호출
        *
        * */
        t2.start();
        System.out.println("main 스레드 종료");
    }
}
