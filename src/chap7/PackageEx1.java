package chap7;

import java.util.Date;
//import java.util.Scanner;
import java.util.*; //java.util 패키지 내의 클래스들은 패키지명 생략가능
/*
*package 예제
*package
* - 클래스, 인터페이스들의 모임 => 주로 기능이 비슷한 클래스, 인터페이스들의 모임
* - 클래스 명은 패키지를 포함한다.
* - package의 설정은 파일 처음에 한번만 구현 가능
* - => 같은 파일에 존재하는 클래스는 같은 패키지에 속한 클래스임.
* - => 패키지가 다른 클래스는 다른 파일에 구현해야 함
*
* import 예약어
* - 클래스 명의 페키지명을 생략할 수 있도록 설정
*
* 클래스의 패키지명을 생략할 수 있는 경우
* 1. 같은 패키지에 속한 클래스 사용시
* 2. java.lang 패키지의 클래스 사용시
* 3. import 구문에서 선언된 클래스 사용시
*       => 패키지명.클래스명 => 클래스명의 패키지명 생략 가능
*       => 패키지명.*       => 패키지에 속한 모든 클래스의 패키지명 생략 가능
*
* */


public class PackageEx1 {
    public static void main(String[] args) {
        // java.lang.String => java.lang에 속한 클래스들은 패키지명 생략 가능
        //java.util.Date now = new java.util.Date(); // => 패키지 명 생략 안한 경우
        Date now = new Date(); //import 구문 설정으로 패키지명 생략 가능
        A a = new A(); // 같은 패키지에 속한 클래스는 패키지명 생략가능
        Scanner sc = new Scanner(System.in);
        Pack1 p1 = new Pack1();
        p1.mehthod();
//      p1.methodP(); // methodP의 접근제어자가 private이므로 접근 불가
        p1.method2();

    }
}
// package a7; => 패키지 구현은 클래스 맨 위 한 번만 가능
class  A{}
class Pack1{
    void mehthod(){ // default 접근제어자
        System.out.println("chap1.Pack1.method 메서드");
    }

    private void mehthodP(){
        System.out.println("chap1.Pack1.method 메서드");
    }

    void method2(){
        mehthodP();
    }
}
































