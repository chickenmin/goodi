package chap12;
/*
* wait(), notify(), notifyAll() 메서드
* 1. Object 클래스의 멤버임. => 모든 객체가 사용 가능한 메서드
* 2. 동기화 영역(동기화 블럭, 동기화 메서드)에서만 호출가능함.
* 3. wait() : 실행중인 스레드를 대기 상태로 변경. lock 해제함
*    notify() : wait() 상태의 스레드 중 한개를(임의로) Runnable 상태로 변경함.
*               개발자 스레드 선택 못함.
*   notifyAll() : wait() 상태의 스레드 모두를 Runnable 상태로 변경함.
* */

class ATM2 implements Runnable {
    public int money = 100000;

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {      }
        synchronized (this) {
            while (true) {
                if (money <= 0) {
                    notifyAll();    //wait() 상태의 스레드가 존재하면 프로세스가 정지됨.
                    break;
                }
                withdraw();
                if (money % 20000 == 0) {
                    try {
                        wait(); //현재 실행 중인 스레드를 대기상태로 변경. lock을 해제함
                    } catch (InterruptedException e) {   }
                } else notifyAll(); //wait() 상태인 스레드를 Runnable 상태로 변경함
            }
        }   //run 메섣가 종료
    }

    private void withdraw() {
        if (money <= 0) {
            return;
        }
        money -= 10000;
        System.out.println(Thread.currentThread().getName() + "출금. 잔액:" + money);
    }
}
public class Thread13 {
    public static void main(String[] args) {
        ATM2 atm = new ATM2();
        Thread alpha = new Thread(atm, "ALPHA");
        Thread beta = new Thread(atm, "BETA");
        alpha.start(); beta.start();
    }
}
