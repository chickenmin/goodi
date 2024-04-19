package chap15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* File 에서 데이터 읽어서 처리하기
* */
public class Stream6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("product.txt"));
        /*
        * //br.lines() : Reader를 통한 데이터를 Stream<String> 생성
        *                product.txt 의 내용을 Stream<String> 생성
        * map(Function) : s : String : Stream<String>
        *                   리턴값 : Car : Stream<Car>
        * */
        br.lines().map(s->{
            String[] str = s.split(",");
            String temp ="";
            try {
                temp = str[4];
            } catch (ArrayIndexOutOfBoundsException e) {
                temp="";
            }
            return new Car(Integer.parseInt(str[0]),
                    Integer.parseInt(str[1]),str[2],
                    Integer.parseInt(str[3]),temp);
        }).filter(c->c.getCar().equals("K9"))   //K9인 자동차만 선택
                .forEach(c-> System.out.println(c));

    }
}
