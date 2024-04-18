package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
* Function 관련 인터페이스
* applyXXX(T)
*
* Function<T,R> : R apply(T)
* ToIntFunction<T> : int applyAsInt(T)
* */
class Student{
    private String name;
    private int eng;
    private int math;
    private String major;

    public Student(String name, int eng, int math, String major) {
        this.name = name;
        this.eng = eng;
        this.math = math;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", eng=" + eng +
                ", math=" + math +
                ", major='" + major + '\'' +
                '}';
    }
}
public class Lambda4 {
    static List<Student> list = Arrays.asList(
            new Student("홍길동",90,80,"경영"),
            new Student("김삿갓",95,70,"컴공"),
            new Student("이몽룡",85,75,"통계")
    );
    public static void main(String[] args) {
        System.out.println("학생 이름: ");
        for (Student s : list) {
            System.out.print(s.getName()+",");
        }
        System.out.println();
        System.out.println("학생 이름: ");
        printString(s -> s.getName());
        System.out.println("전공 이름: ");
        printString(s -> s.getMajor());
        System.out.println("수학점수: ");
        printString(s -> s.getMath()+"");
        System.out.println("영어점수: ");
        printString(s -> s.getEng()+"");

        printString(s->s.getName() +"("+(s.getEng()+s.getMath())+")");

        System.out.print("학생들의 영어점수 합계: ");
        printTot(s -> s.getEng());

        System.out.print("학생들의 수학점수 합계: ");
        printTot(s -> s.getMath());

        System.out.print("학생들의 전체점수 합계: ");
        printTot(s -> s.getEng()+s.getMath());



    }

    private static void printTot(ToIntFunction<Student> f) {
        int sum = 0;
        for (Student s : list) {
            sum += f.applyAsInt(s);
        }
        System.out.println(sum);
    }

    static void printString(Function<Student,String>f) {
        for (Student s : list) {
            System.out.print(f.apply(s) + ",");
        }
        System.out.println();
    }
}
