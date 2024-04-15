package chap12;
class PrintThread1 extends Thread{
    char ch;
    static Object lock = new Object(); //객체만 가능 기본 자료형 안됨
    PrintThread1(char ch){
        this.ch = ch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (lock) {
                for (int j = 0; j < 80; j++) {
                    System.out.println(ch);
                }
                System.out.println();
            }

        }
    }
}
public class T7 {
    public static void main(String[] args) {
        PrintThread1 t1 = new PrintThread1('A');
        PrintThread1 t2 = new PrintThread1('B');
        PrintThread1 t3 = new PrintThread1('C');
        t1.start();t2.start();t3.start();
    }
}
