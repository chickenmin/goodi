package chap7;
/*
  final : 변경불가의 의미
* final 메서드 : 재정의 불가. 오버라이딩 불가 함수
*
* */

class FinalMehthod1{
    final void method() {
        System.out.println("Final Mehod의 method");
    }
    void method1(){
        System.out.println("FinalMethod");
    }
}

class FinalMehodSub extends FinalMehthod1 {
//    void method(){ // final 메서드이므로 오버라이딩 불가
//        System.out.println("Final Sub의 method");
//
//    }

    void method1(){
        System.out.println("FinalMethodSub");
    }
}







public class FinalMethod {
    public static void main(String[] args) {
        FinalMehodSub f = new FinalMehodSub();
        f.method1();
        f.method();
    }
}
