package chap6;
/*
* Rectangle2 클래스를 이용하여
* 가로. 세로 길이가 20~30사이인 임의의 길이를 가진 사각형 5개 생성
* 생성된 5개의 사각형 정보를 출력하기
* 전체 사각형의 넓이의 합 출력하기
*/
public class RectangleEx2 {
    public static void main(String[] args) {
        Rectangle2[] arr = new Rectangle2[5];
        int toArea = 0, toLen = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Rectangle2();
            arr[i].width = (int)(Math.random()*11) +20;
            arr[i].height = (int)(Math.random()*11) +20;
            arr[i].sno = ++Rectangle2.cnt;
            System.out.println(arr[i]);
            toArea += arr[i].area();
            toLen += arr[i].length();
        }

        System.out.println("전체 사각형 넓이의 합: " + toArea);
        System.out.println("전체 사각형 둘레의 합: " + toLen);
        System.out.println(arr[0]);
    }
}
