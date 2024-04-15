package chap14;

import java.io.IOException;
import java.io.InputStream;
/*
* InputStream : 바이트형 입력 스트림의 최상위 클래스
*   바이트형 : 1바이트 단위로 데이터를 처리
* */
public class InputStream1 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; //표준입력스트림. 키보드로 연결
        int data;
//        in.read() : 1바이트 단위로 읽기. 한글이 깨짐
        while ((data = in.read()) != -1) {  //ctrl+z
            System.out.print((char)data);
        }
    }
}
