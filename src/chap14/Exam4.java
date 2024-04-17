package chap14;

import java.io.File;

/*
* c*/
public class Exam4 {
    public static void main(String[] args) {
//        String filePath = "c:/windows";
        String filePath = "c:/Windows/Boot";
        File f1 = new File(filePath);
        String[] files = f1.list();
        int fileSum = 0, dirSum = 0;
        long size = 0;
        for (String f : files) {
//            File f2 = new File(filePath, f);
            File f2 = new File(f1, f);
            if (f2.isDirectory()) {
                dirSum++;
            } else {
                System.out.println(f + "폴더. 크기:" + f2.length());
                fileSum++;
                size += f2.length();

            }

        }
        System.out.println("파일 갯수: " + fileSum);
        System.out.println("폴더 갯수: " + dirSum);
        System.out.println("파일의 총 크기:" + size);
    }
}
