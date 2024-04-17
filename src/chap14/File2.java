package chap14;

import java.io.File;
import java.io.IOException;
import java.util.Date;
/*
* File 클래스의 주요 메서드
*  String getAbsolutePath() : 절대 경로
*  boolean mkdir() : 한개의 폴더 생성. 성공:true, 실패:false
*  boolean mkdirs() : 여러단계의 폴더 생성. 성공:true, 실패:false
*  boolean createNewFile() : 파일 생성. 성공:true, 실패:false
*  String getName() : 파일의 이름
*  long length() : 파일의 크기
*  boolean exists() : 파일(폴더) 존재 여부. 존재:true , 부재:false
*  boolean renameTo(File f) : 현재 File을 f 객체로 변경. 파일의 이름 변경.
*  long lastModified() : 1970년부터 파일이 마지막으로 변경된 시간까지를 밀리초로 리턴
*  boolean delete() : 현재 파일 제거. 성공: true, 실패: false
*  boolean isDirectory() : 현재 파일이 폴더? 폴더:true. 파일:false
*  boolean isFile() : 현재 파일이 파일? 파일:true. 폴더:false
*  boolean isHidden() : 숨긴 파일?
*
*
* */
public class File2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("c:/temp1");
        System.out.printf("%s 폴더 생성:%b\n", f1.getAbsolutePath(), f1.mkdir());

        File f2 = new File("c:/temp1/test.txt");
        System.out.printf("%s 파일 생성:%b\n", f2.getAbsolutePath(), f2.createNewFile());
        System.out.printf("파일 이름:%s, 파일크기 :%d\n", f2.getName(), f2.length());

        File f3 = new File("c:/temp1/test2.txt");
        if (f3.exists()) {
            System.out.println(f3.getName() + "파일은 존재함");
        } else {
            System.out.println(f3.getName() + "파일은 없음");
        }

        System.out.printf("%s->%s 이름변경 : %b\n", f2.getName(), f3.getName(), f2.renameTo(f3));

        System.out.printf("%s 파일 최종 수정시간:%s,%d\n", f3.getName(), new Date(f3.lastModified()), f3.lastModified());
        System.out.printf("%s 파일 삭제:%b\n",f3.getName(),f3.delete());



    }
}
