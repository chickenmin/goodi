package chap15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream8 {
    public static void main(String[] args) {
        List<Student> list1= Arrays.asList(
                new Student("홍길동",70,80,"경영"),
                new Student("김길동",75,70,"컴공")
        );

        List<Student> list2 = Arrays.asList(
                new Student("김삿갓",90,88,"경영"),
                new Student("장영호",95,75,"컴공")
        );

        List<List<Student>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        /*
        List<List<Student>> list.stream()
        * s : List<Student> 형
        s.stream() : Stream<Student>
        */

        Stream<Student> st = list.stream().flatMap(s->s.stream());
//        영어점수합계
        System.out.println(st.mapToInt(s->s.getEng()).sum());

    }
}
