package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Exam1 {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동",55,90,"경영"),
            new Student("이몽룡",95,90,"컴공"),
            new Student("김삿갓",75,80,"심리"),
            new Student("임꺽정",65,70,"전자"),
            new Student("성춘향",55,80,"컴공")
    );

    public static void main(String[] args) {
        int mathSum =0, engSum = 0;

        for (Student s : list) {
            System.out.print(s);
            System.out.printf(",총점:%3d,평균:%.2f\n",
                    s.getEng()+s.getMath(),(s.getEng()+s.getMath())/2.0);
            mathSum += s.getMath();
            engSum += s.getEng();

        }
        System.out.println("수학 점수 총점: " + mathSum);
        System.out.println("영어 점수 총점: " + engSum);
        System.out.printf("수학 점수 평균 : %.2f\n",((double)mathSum/list.size()));
        System.out.printf("영어 점수 평균 : %.2f\n",((double)engSum/list.size()));



    /*    for (Student s : list) {
            int tot = s.getMath()+s.getEng();
            System.out.println(s+",총점 = "+ tot +", 평균 = " + tot/2.0 );
        }
        System.out.println("수학 총점=" + getMathTot());
        System.out.println("수학 총점=" + getEngTot());*/

    }
    static int getMathTot(){
        int result = list.get(0).getMath();
        for (Student s : list) {
            result += s.getMath();
        }
        return result;
    }

    static int getEngTot(){
        int result = list.get(0).getEng();
        for (Student s : list) {
            result += s.getEng();
        }
        return result;
    }
}
