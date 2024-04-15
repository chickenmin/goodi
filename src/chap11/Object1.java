package chap11;
/*
* Object 클래스 : equals 메서드
* equals 메서드 : 같은 내용인지를 비교
*                Object 클래스의 equals 메서드는 == 같은 기능을 함.
*               => 내용 비교를 위해서는 오버라이딩 필요
*
* == : 같은 객체 여부 리턴
* */

import java.util.Objects;

class Equal{
    int value;

    Equal(int value) {
        this.value = value;
    }

//   같은 내용인 경우에 결과가 true
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Equal) {
            Equal e = (Equal) obj;
            return value == e.value;
        } else  return false;
    }

//    같은 내용인 경우 리턴값이 동일
    @Override
    public int hashCode() {
        return value+1000;
    }
}
public class Object1 {
    public static void main(String[] args) {
        Equal e1 = new Equal(10);
        Equal e2 = new Equal(10);
        if (e1 == e2) {
            System.out.println("e1과 e2는 같은 객체임");
        } else {
            System.out.println("e1과 e2는 다른 객체임");
        }
        if (e1.equals(e2)) {
            System.out.println("e1과 e2는 같은 내용의 객체임");
        } else {
            System.out.println("e1과 e2는 다른 내용의 객체임");
        }
    }
}
