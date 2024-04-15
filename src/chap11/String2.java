package chap11;
/*
* String  클래스의 주요 메서드*/
public class String2 {
    public static void main(String[] args) {
        String s = new String("ABCDEFGH");
//      charAt(4) : 문자열에서 4번 인덱스(5번째)의 문자리턴
        System.out.println("s.charAt(4):" + s.charAt(4)); //E
        /*
        * s.compareTo(문자열) : 정렬에 사용되는 메서드
        *       결과 양수 : s 문자열이 뒤쪽
        *       결과 음수 : s 문자열에 앞쪽*/
        System.out.println( "s.compareTo(\"abc\"): "+ s.compareTo("abc")); //-32
        System.out.println( "s.compareTo(\"AAA\"): "+ s.compareTo("AAA")); //1 : s문자열이 AAA보다 뒤에 있음
//        compareToIgnoreCase : 대소문자 상관없이.
        System.out.println( "s.compareToIgnoreCase(\"abc\"): "+ s.compareToIgnoreCase("abc"));
//        s.endsWith("GH") : s문자열의 끝이 GH?
        System.out.println( "s.endsWith(\"GH\")"+s.endsWith("GH"));
//        s.startsWith("GH") : s문자열의 시작이 AB?
        System.out.println( "s.startsWith(\"AB\")"+s.startsWith("AB"));
//        s.equals("ABCEDFG") : s문자열이 "ABCDEFG"와 같은지 여부
        System.out.println("s.equals(\"ABCDEFGH\")"+s.equals("ABCDEFGH"));
//        s.equals("ABCEDFG") : s문자열이 대소문자 상관없이 "abcdefgh"와 같은지 여부
        System.out.println("s.equalsIgnoreCase(\"abcdefgh\")"+s.equalsIgnoreCase("abcdefgh"));
//      s.getBytes : s 문자열을 byte형 배열로 리턴
        byte[] barr = s.getBytes();
        for (byte b : barr) {
            System.out.print((char)b);
        }
        System.out.println(        );

        char[] carr = s.toCharArray();
        for (char c : carr) {
            System.out.print(c);
        }
        System.out.println();

        s = "This is a String";
//        s.indexOf('i') : i 문자의 인덱스 값 리턴, 없는 문자는 -1 리턴
        System.out.println("s.indexOf('i'): "+s.indexOf('i'));
        System.out.println("s.indexOf('Q'): "+s.indexOf('Q'));
        System.out.println("s.indexOf(\"is\"): "+s.indexOf("is"));

//        s.indexOf('i',3) : 3번 인덱스 이후의 i 문자의 인덱스 값 리턴
        System.out.println("s.indexOf('i',3): "+s.indexOf('i',3)); //5
//        s.lastIndexOf('i') :i 문자를 뒤우선으로 검색하여 인덱스 리턴
        System.out.println("s.lastIndexOf('i'):" +s.lastIndexOf('i'));
//        문자열의 길이
        System.out.println( "s.length():"+s.length());
//        문자열의 치환
        System.out.println("s.replace(\"is\", \"QR\") : "+s.replace("is", "QR"));
        System.out.println("s.replaceAll(\"is\", \"QR\") : "+s.replaceAll("is", "QR"));
//        부분 문자열
//        s.substring(5) : 5번 인덱스 이후 부분 문자열
        System.out.println("s.substring(5) : "+s.substring(5));
        //        s.substring(5) : 5번 인덱스부터 12번 인덱스까지 문자열
        System.out.println("s.substring(5,13) : "+s.substring(5,13));
//        대소문자 변경
        System.out.println("s.toUpperCase(): "+s.toUpperCase());
        System.out.println("s.toLowerCase()(): "+s.toLowerCase());
//      양쪽 공백 제거
        s = "  문자열 trim method   ";
        System.out.println("s.trim(): "+s.trim());
//       문자열 분리
        s ="홍길동,이몽룡,김삿갓";
        String[] arr = s.split(",");
        for (String a : arr) {
            System.out.println(a);
        }


    }
}
