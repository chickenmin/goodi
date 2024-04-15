package chap11;

public class Exam4 {
    public static void main(String[] args) {
        String str = "10,20,30,40,50";
//        문자열 분리
        int [] intArr = new int[5];
        String[] arr = str.split(",");
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i].trim());
            sum += intArr[i]
;            System.out.print(intArr[i] + ", ");
        }
        System.out.println("의 합: "+sum);
    }
}
