package chap11;
/*
* switch 구문에서 사용되는 조건값
* switch (조건값)
* 조건값으로 사용이 가능한 자료형 : byte, short, int, char, String
* Wrapper 클래스도 가능함. Byte, Short, Integer, Character
* */
public class Wrapper4 {
    public static void main(String[] args) {
        int num = 5;
        switch (num) {
            case 1 :
                System.out.println("1");
                break;
            default:
                System.out.println(num);

        }
    }
}
