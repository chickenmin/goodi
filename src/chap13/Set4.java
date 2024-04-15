package chap13;

import java.util.Comparator;
import java.util.TreeSet;

class PhoneNo{
    String name;
    int number;

    public PhoneNo(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name+":"+number;
    }
}
public class Set4 {
    public static void main(String[] args) {
        //이름 순으로 정렬 설정
        Comparator<PhoneNo> c = new Comparator<>(){
            public int compare(PhoneNo o1, PhoneNo o2) {
                return o1.name.compareTo(o2.name);
            }
        } ;
//        TreeSet<PhoneNo> set = new TreeSet<>(c); //위에 익명객체 입력
//        TreeSet<PhoneNo> set = new TreeSet<>((o1,o2)->o1.name.compareTo(o2.name)); //람다방식
//        TreeSet<PhoneNo> set = new TreeSet<>((o1,o2)->o2.name.compareTo(o1.name)); //내림차순 람다
//        TreeSet<PhoneNo> set = new TreeSet<>((o1,o2)-> o1.number - o2.number); //람다 번호로
        TreeSet<PhoneNo> set = new TreeSet<>((o1,o2)-> o2.number - o1.number); // 람다 번호 내림차순

        set.add(new PhoneNo("홍길동", 1234));
        set.add(new PhoneNo("김삿갓", 2345));
        set.add(new PhoneNo("이몽룡", 3456));
        System.out.println(set);



    }
}
