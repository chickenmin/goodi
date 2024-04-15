package chap13;

import java.util.HashSet;
import java.util.Set;

class Student{
    int studN;
    String name, major;

    public Student(int studN, String name, String major) {  //학번 이름 같으면 동일
        this.studN = studN;
        this.name = name;
        this.major = major;
    }

    @Override
    public String toString() {
        return

                "name= " + name +  ", studN :" + studN + ", major : " + major ;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+studN;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return name.equals(s.name) && (studN == s.studN);
        } return false;
    }
}
public class Exam2 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(1234,"홍길동","경영"));
        set.add(new Student(2345,"홍길순","경영"));
        set.add(new Student(2345,"홍길순","컴공"));
        set.add(new Student(1234,"홍길동","통계"));
        set.add(new Student(4567,"홍길동","경영"));

        System.out.println("등록 학생수:" + set.size());
        System.out.println("========등록 학생========");
        for (Student s : set) {
            System.out.println(s);
        }
    }
}






























