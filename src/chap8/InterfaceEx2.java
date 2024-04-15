package chap8;
/*
* 인터페이스간의 상속은 다중 상속이 가능함
* */
interface Complexerable extends Printable, Scannerable, Faxable{

}

class Complexer2 implements Complexerable{
    int ink;
    Complexer2(){
        ink = INK;
    }
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


public class InterfaceEx2 {
    public static void main(String[] args) {
        System.out.println("기본잉크량: " + Printable.INK);
        System.out.println("기본잉크량: " + Complexerable.INK);
        System.out.println("기본잉크량: " + Complexer.INK);
        System.out.println("기본잉크량: " + Complexer2.INK);

        System.out.println("FAX 번호: " + Faxable.FAX_NO);
        System.out.println("FAX 번호: " + Complexerable.FAX_NO);
        System.out.println("FAX 번호: " + Complexer.FAX_NO);
        System.out.println("FAX 번호: " + Complexer2.FAX_NO);

        Complexer2 com = new Complexer2();
        if (com instanceof Complexerable) {
            System.out.println("com 객체는 Complexerable형으로 형변환이 가능함");
            Complexerable c = com;
            c.print();
            c.scan(); c.receive("02-222"); c.send("030");
            System.out.println(c.FAX_NO);
          //  System.out.println(c.ink); // Complexerable 멤버 아님
        }



    }
}
