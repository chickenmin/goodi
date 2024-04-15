package chap8;
/*
* 인터페이스
* 1. 멤버 : 상수, 추상메서드, default 메서드, static 메서드 (일반적인 변수, 메서드 소유 불가)
* 2. 접근제한자는 무조건 public
* 3. 객체화 불가 => 구현 클래스(인터페이스를 구현)의 객체화로 객체화
* 4. 클래스와 인터페이스는 구현으로 표현함 => implements 예약어 사용
*   => 다중 구현 가능
* 5. 인터페이스간에 상속이 가능함 => 다중 상속이 가능함
* 6. 참조자료형임
*
* 인터페이스 멤버
*   상수 : [public static final] int NUM =100;
*   추상메서드 : [public abstract] int method(int a);
* jdk 8 이후에 추가된 멤버 : 구현부 존재 가능
* default 메서드 : default int method(...) {   } => 인스턴스 멤버
* static 메서드 : static int method(...) {    } => 클래스 멤버
*
* */

interface Printable{
    int INK = 100; // 상수 : public final static 예약어 생략
     void print(); //추상메서드 : public abstract 예약어 생략됨
                        // => 구현클래스에서 반드시 오버라이딩 해야함
}

interface Scannerable{
    void scan();
}

interface Faxable {
    String FAX_NO = "02-1111-2222";

    void send(String no);

    void receive(String no);
}

//다중 구현 클래스
class Complexer implements Printable, Scannerable, Faxable {
    int ink;
    Complexer() {
        ink = INK;
    }

    @Override
    public void print() {
        System.out.println("프린트 출력합니다. 남은 잉크량:" + --ink);

    }

    @Override
    public void scan() {
        System.out.println("이미지를 스캔합니다.");
    }

    @Override
    public void send(String no) {
        System.out.println(FAX_NO + "에서" + no + "로 FAX를 보냅니다.");
    }

    @Override
    public void receive(String no) {
        System.out.println(no + "에서" + FAX_NO + "로 FAX를 받았습니다.");
    }
}






public class InterfaceEx1 {
    public static void main(String[] args) {
        Complexer com = new Complexer();
//        Faxable.FAX_NO = "02-2222-3333"; //상수 변경 불가
//        Printable.INK = 200; // 상수 변경 불가

        System.out.println("Faxable.FAX_NO=" + Faxable.FAX_NO); //static 상수
        System.out.println("Printable.INK=" + Printable.INK);
        System.out.println("Complexer.FAX_NO=" + Complexer.FAX_NO);
        System.out.println("Complexer.FAX_NO=" + Complexer.INK);
        com.print();
        com.scan();
        com.send("02-2222-3333");
        com.receive("02-2222-3333");

        if (com instanceof Printable) {
            System.out.println("com 객체는 Printable형으로 형변환 가능함.");
            Printable p = (Printable) com; // 형변환 연산자 생략이 가능 (자동형변환)
            p.print();
//            p.scan(); // printable 형변환으로 접근 불가
//            p.send("030");
//            p.receive("010");
        }
        if (com instanceof Scannerable) {
            System.out.println("com 객체는 Scannerable 형으로 형변환 가능함.");
            Scannerable p = (Scannerable) com; // 형변환 연산자 생략이 가능 (자동형변환)
//            p.print();
            p.scan();
//            p.send("030");
//            p.receive("010");

        }
        if (com instanceof Faxable) {
            System.out.println("com 객체는 Faxable 형으로 형변환 가능함.");
            Faxable f = com;
//            f.print();
//            f.scan();
            f.send("030");
            f.receive("010");
            System.out.println("남은 잉크량: " + com.ink);
//            System.out.println("남은 잉크량: " + f.ink);

        }






    }
}



















