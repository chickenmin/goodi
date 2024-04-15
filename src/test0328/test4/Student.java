package test0328.test4;

public class Student {
    int num, kor, eng, math;
    String name;

    public Student(String name,int num) {
        this.num = num;
        this.name = name;
    }

    public Student(String name,int num, int kor, int eng, int math){
        this(name,num);
        this.eng = eng;
        this.kor = kor;
        this.math = math;
    }

    public String toString(){
        return
                "학번 : "+ num+ "\n이름: "+ name + "\n국어: " + kor + "\n영어: " + eng + "\n수학:" +math + "\n총점: "+ (kor+eng+math) + "\n평균: " + (kor+eng+math)/3.0;
    }
}
