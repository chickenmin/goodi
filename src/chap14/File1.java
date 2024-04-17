package chap14;

import java.io.File;

/*
* File 클래스 : 파일이나 폴더의 정보를 관리하는 클래스
* => 없는 파일도 관리.
* 폴더구분자
*   윈도우 : \\(역슬래시), /(슬래시)
*   리눅스, 맥 : /(슬래쉬)
* */
public class File1 {
    public static void main(String[] args) {
        String filePath = "c:/";
//        f1 : c드라이브의 root 폴더 관리
        File f1 = new File(filePath);
        String [] files = f1.list();    //f1 하위 폴더, 파일의 이름 목록
        for (String f : files) {
//            f2 = : c드라이브의 하위 파일(폴더) 1개를 관리
            File f2 = new File(filePath, f);    //(filePath, f) : 부모파일, 파일 이름
            if (f2.isDirectory()) { //f2 파일이 폴더니?
                System.out.printf("%s:디렉토리\n", f);
            } else{ //f2 파일이 폴더 아님. %,d : f2.length() 출력. 3자리마다,출력
//                f2.length() : 파일의 크기
                System.out.printf("%s:파일(%,dbyte)\n",f,f2.length()); }
        }

    }
}
