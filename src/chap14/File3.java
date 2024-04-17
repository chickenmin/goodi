package chap14;

/* File 클래스를 이용하여 파일 읽기
* */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File3 {
    public static void main(String[] args) throws IOException {
        File f = new File("c:/temp1/test2.txt");
        if (!f.exists()) {
            System.out.println("파일이 없습니다.");
            return;
        }
        FileInputStream fis = new FileInputStream(f);
        int len = 0;
        byte[] buf = new byte[8096];
        while ((len = fis.read(buf)) != -1) {
            System.out.println(new String(buf,0,len));
        }
        fis.close();
        f.delete(); //f 파일 제거


    }
}
