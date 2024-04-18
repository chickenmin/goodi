package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동",55,90,"경영"),
            new Student("이몽룡",95,90,"컴공"),
            new Student("김삿갓",75,80,"심리"),
            new Student("임꺽정",65,70,"전자"),
            new Student("성춘향",55,80,"컴공")
    );

    public static void main(String[] args) {
//        list.stream() : Stream 객체로 변경  // Stream : 대용량 사용
        Stream<Student> st = list.stream();
//        forEach : 내부 반복자. 주로 결과 출력때 사용
        st.forEach(s->{ //s : Student 객체 //내부클래스임
            System.out.print(s);
            int sum = s.getEng() + s.getMath();
            double avg = sum/2.0;
            System.out.printf(",총점:%3d,평균:%.2f\n",sum,avg);
        }); //forEach 한번으로 st는 끝남 - 일회용

        System.out.println();

//        System.out.println("수학 점수 총점: "+
//                st.mapToInt(s->s.getMath()).sum());       //IllegalStateException
//        mapToInt : Stream -> IntStream으로 변경
//        sum() : IntStream 내부 요소들의 합.

        System.out.println("수학 점수 총점: "+
        list.stream().mapToInt(s->s.getMath()).sum());
        System.out.println("영어 점수 총점: "+
                list.stream().mapToInt(s->s.getEng()).sum());

        System.out.println("수학 점수 평균: "+
                list.stream().mapToInt(s->s.getMath()).average().getAsDouble());

        System.out.println("영어 점수 평균: "+
                list.stream().mapToInt(s->s.getEng()).average().getAsDouble());

        long cnt = list.stream().count();   // count의 반환값이  long임
        System.out.println("전체 인원수 : " + list.stream().count());

    }
}
