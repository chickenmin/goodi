package chap10;

/*
* throws : 예외처리
*          발생된 예외를 호출한 메서드로 예외 전달
* */
public class Exception4 {
    public static void main(String[] args) {
        System.out.println("main 메서드 실행");
        try {
            first();
        } catch (NumberFormatException e) {
            System.out.println("main 메서드에서 예외처리");
        }
    }

    private static void first() {
        System.out.println("first 메서드 실행");
        second();
    }

    private static void second() {
        System.out.println("second 메서드 실행");
        int num = Integer.parseInt("abc");
        System.out.println(num);
        /*
        try {
            int num = Integer.parseInt("abc");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("second 메서드에서 예외처리함");
        }

         */
    }

}
