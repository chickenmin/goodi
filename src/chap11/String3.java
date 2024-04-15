package chap11;
/*
* String : 정적인 문자열. 변경 불가 문자열
*
* */
public class String3 {
    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println("main : " + str);
        str = change(str);
        System.out.println("change 후 : " + str);
    }

    private static String change(String str) {
        str += 456;
        System.out.println("change: " + str);
        return str;
    }

    /*
    private static void change(String str) {
        str += 456;
        System.out.println("change : " + str);
    }
     */
}
