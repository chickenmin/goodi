package chap11;
/*
* count 메서드 구현하기
* count("문자열", "찾는 문자열) : 문자열에서 찾는 문자열의 갯수 리턴하는 메서드
*
* */


public class Exam2 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB45AB12", "12"));
        System.out.println(count("12345AB12AB45AB", "AB"));
        System.out.println(count("12345", "AB"));
    }

    private static int count(String s, String number) {
        int i = 0, cnt = 0, n;

        while (true) {
            i = s.indexOf(number, i);   // s2의 index값
            if (i < 0) {
                break;
            }
            cnt++;
            i++;
        }
        return cnt;


//       do {
//
//           i += s.indexOf(number,i);
//           cnt++;
//           n = s.indexOf(number,i);
//       } while (n != -1);
//       return cnt;
//    }

    }
}

