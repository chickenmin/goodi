package chap11;

public class Exam3 {
    public static void main(String[] args) {
        System.out.println(delChar("(1!2@3^4~5","~!@#$%^&*()")); //12345
        System.out.println(delChar("(1!2@3^4~5","12345")); //(!@^~)
        System.out.println(delChar2("(1!2@3^4~5","~!@#$%^&*()")); //12345
        System.out.println(delChar2("(1!2@3^4~5","12345")); //(!@^~)
    }

    private static StringBuilder delChar(String s1, String s2) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (s2.indexOf(s1.charAt(i)) < 0) { // 문자 없음
                sb.append(ch);
            }
        }
        return sb;


    }

    private static String delChar2(String s1, String s2) {
        String s = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!s2.contains(ch+"")) { //contains(String)
                s += ch;
            }
        }
        return s;


    }
}
