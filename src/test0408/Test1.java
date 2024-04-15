package test0408;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)
 [결과]
 가나다
  가나다
    가나다
가나
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "가나다라";
        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));
        System.out.println(format(str, 1, 0));
    }



    private static String format (String str, int len, int align) {
        StringBuilder sb = new StringBuilder();
        int mid =  (int)((len-str.length())/2);

        if (len <= str.length()) {
            sb.append(str.substring(0,len));
            return sb.toString();
        }

        for (int i = 0; i < len; i++) {
            sb.append(" ");
        }

        if (align == 0) {
            sb.replace(0, str.length(), str);
            return sb.toString();

        } else if (align == 2) {
            sb.replace(len-str.length(),len,str);
            return sb.toString();
        } else
            sb.replace(mid,mid+str.length(),str);
            return sb.toString();





    }
}
