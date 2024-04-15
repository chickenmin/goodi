package chap12;

import java.io.IOException;

/*
* Process 예제
*   Process : OS(window 환경)상에서 실행되는 프로그램
*   멀티 프로세스 환경 : 프로세스가 동시에 여러개 실행가능한 환경
*
*  Runtime Runtime.getRuntime() : OS로 부터 프로레스 실행 권한을 받음
* Process Runtime.exe(명령어) : OS상에서 실행 중인 프로그램
 * */

public class Process1 {
    public static void main(String[] args) {
        try {
            Process p1 = Runtime.getRuntime().exec("calc.exe");
            Process p2 = Runtime.getRuntime().exec("notepad.exe");
            p2.waitFor();   //p1 프로세스 종료시까지 main이 대기함
           // p1.destroy();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
