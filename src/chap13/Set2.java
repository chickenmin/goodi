package chap13;

import java.util.HashSet;
import java.util.Set;

/*
* 객체의 중복 판단
* 1. equals() : 결과가 true
* 2. hashCode() : 결과가 동일
* => 1과 2의 조건을 모두 만족해야함. => 오버라이딩 필요
*
* // hashCode랑 equals 같이 오버라이딩 하는 것이 권장됨
* */
class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return name+":"+age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return name.equals(p.name) && age == p.age;
        } else return false;

    }

    @Override
    public int hashCode() {
        return name.hashCode()+10;
    }
}
public class Set2 {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person("홍길동",10));
        set.add(new Person("홍길동",10));
//        Person p = new Person("홍길동", 10);
//        set.add(p);
//        set.add(p);
//        StringBuilder, StringBuffer : equals 메서드를 오버라이딩 하지 않음
//                                         String클래스로 변경한 후 중복 불가
        set.add(new StringBuffer("abcd"));
        set.add(new StringBuffer("abcd"));
        set.add(new StringBuffer("abcde"));
        set.add(new StringBuffer("abcde"));

        System.out.println(set);



    }
}
