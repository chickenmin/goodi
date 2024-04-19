package chap15;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Stream의 요소를 List,배열,Map으로 변경하기
* */
public class Stream10 {
    public static void main(String[] args) {
        Student[] strArr = {
                new Student("홍길동",60,75,"경영"),
                new Student("김삿갓",80,65,"컴공"),
                new Student("이몽룡",90,85,"전기"),
                new Student("김자바",60,85,"통계")

        };
        System.out.println("이름만 List<String> 객체로 저장하기");
//        Stream.of(strArr) : Student 배열 => Stream<Student>
//        map(Student:getName) : 매개변수: Student, 리턴값:String
//                              Stream<Student> -> Stream<String>
//      toList() : Stream<String> -> List<String>
        List<String> names = Stream.of(strArr).map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println("Stream<Student> => List<Student> 객체로 저장하기");
        List<Student> list = Stream.of(strArr).collect(Collectors.toList());
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("Stream<Student> => Student 배열 객체로 저장하기");
        Student[] strArr2 = Stream.of(strArr).toArray(Student[]::new);
        for (Student s : strArr2) {
            System.out.println(s);
        }

        System.out.println("Stream<Student> => <String, Student> Map 객체로 저장하기");
        Map<String, Student> map = Stream.of(strArr)
                .collect(Collectors.toMap(s->s.getName(),s->s));

        for (String s : map.keySet()) {
            System.out.println(s+"="+map.get(s));
        }

    }
}

/*
* Stream<T> -> List<T> :  collect(Collectors.toList())
* Stream<T> -> Map<K,V> : collect(Collectors.toMap(key,value)
* Stream<T> -> T[] arr : toArray(T[]::new)
* */













