package test0412;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int ko,en,ma;

    public Student(String name, int ko, int en, int ma) {
        this.name = name;
        this.ko = ko;
        this.en = en;
        this.ma = ma;
    }

    int getTotal(){
        return (ko+en+ma);
    }

    @Override
    public String toString() {
        return name +":"+"국어 ("+ko +"), 영어 ("+en + "), 수학("+ma + "), 총점("+getTotal()+"), 평균 ("+ getTotal()/3.0 +")";
    }
    public int compareTo(Student o) {
        return name.compareTo(o.name);

    }
}
public class Test4 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("홍길동", 90, 80, 70));
        list.add(new Student("김삿갓", 95, 85, 75));
        list.add(new Student("이몽룡", 80, 95, 95));
        list.add(new Student("임꺽정", 60, 75, 100));
        Collections.sort(list);
        System.out.println("이름 오름차순");
        for (Student s : list) {
            System.out.println(s);
            
        }


        Comparator<Student> c = new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  o2.getTotal()-o1.getTotal();         //음수:o1 객체가 앞, 양수: o1 객체가 뒤쪽
            }
        };
        System.out.println("총점 내림차순");
        Collections.sort(list,c);
        for (Student s : list) {
            System.out.println(s);
        }

    }
}
