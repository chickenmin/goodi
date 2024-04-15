package test0326;

class Student{
    String name;
    int ban, no, kor, eng, math;

    int getTotal() {
        return kor +eng + math;
    }

    float getAvg() {
        return (float) (getTotal()/3.0);
    }
}
public class Test6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.ban = 1;
        s1.no = 1;
        s1.kor = 100;
        s1.eng = 80;
        s1.math = 85;
        System.out.println(s1.getTotal());
        System.out.println(s1.getAvg());
    }
}
