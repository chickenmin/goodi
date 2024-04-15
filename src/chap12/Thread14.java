package chap12;

/*
* 생성자, 소비자 스레드
*
* 엄마와 아들이 하나의 계좌를 공유
* 계좌 금액이 0이면 아들 wait() 함
*
* 계좌금액이 0보다 크면 엄마 wait()
*
*
* 엄마는 1만, 2만, 3만으로 계조에 입금함
* 엄마 : 0~3초 동암 임의로 sleep
*  아들 : 0~1초 동안 임의로 sleep*/

class Account{
    int money;
    synchronized void output() { //동기화 메서드. Son 스레드가 호출
        while (money == 0) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        //money > 0
        notifyAll(); //wait() 상태 스레드를 Runnable 상태로 변경
        System.out.println(Thread.currentThread().getName() + ":" + money + "원 출금");
        money = 0;
    }

    synchronized void input() {     //동기화 메서드 mother 스레드가 호출
        while (money > 0) { // 소비자 스레드가 데이터 사용 전
            try {
                wait();
            } catch (InterruptedException e) {            }
        } money = ((int)(Math.random()*3)+1)*10000; //1~3만 사이 임의의 값
        notifyAll();
        System.out.println(Thread.currentThread().getName()+":"+money+"원 입금");
    }
}

class Mother extends Thread{    //생산자 스레드
    Account account;

    Mother(Account account) {
        super("Mother");
        this.account = account;
    }
    public void run(){
        for (int i = 0; i < 20; i++) {
            account.input();
            try {
                sleep((int) (Math.random() * 3000));    //0~3초 사이로 sleep
            } catch (InterruptedException e) {}
        }
    }
}

class Son extends Thread{   //소비자 스레드
    Account account;

    Son(Account account) {
        super("Son");
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            account.output();
            try {
            sleep(((int)(Math.random()*1000))); //0~1초 사이로 sleep
            } catch (InterruptedException e) {}
        }
    }
}

public class Thread14 {
    public static void main(String[] args) {
        Account acc = new Account();
        Thread m = new Mother(acc);
        Thread s = new Son(acc);
         s.start(); m.start();
    }
}
