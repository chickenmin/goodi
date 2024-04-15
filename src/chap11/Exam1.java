package chap11;


import java.util.Objects;

class   Number{
    int num;

    Number(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Number) {
            Number n = (Number) obj;
            return n.num == this.num;
        } else return false;
    }
}
public class Exam1 {
    public static void main(String[] args) {
        Number n1 = new Number(100);
        Number n2 = new Number(100);
        if (n1 == n2) System.out.println("같은 객체임");
        else System.out.println("다른 객체임");
        if (n1.equals(n2)) { //내용비교
            System.out.println("같은 숫자임");
        } else System.out.println("다른 숫자임");

        String s1 = new String("abc");
        String s2 = new String("abc");
        if (s1 == s2) System.out.println("s1과 s2는 같은 객체임");
        else System.out.println("s1과 s2는 다른 객체임");
        if (n1.equals(n2)) { //내용비교
            System.out.println("s1과 s2는 같은 문자열임");
        } else System.out.println("s1과 s2는 다른 문자열임");

    }
}
