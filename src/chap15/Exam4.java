package chap15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class Exam4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("product.txt"));
//        map(Function) 사용시 객체생성
        Function<String, Car> f = s->{
//            String 형 s : 7,2,bmw,1
            String[] str = s.split(",");
            String temp = "";
            try {
                temp = str[4];
            } catch (ArrayIndexOutOfBoundsException e) {
                temp = "";
            }
            return  new Car(Integer.parseInt(str[0]),
                    Integer.parseInt(str[1]),
                    str[2],Integer.parseInt(str[3]),temp
            );
        };
//      map() : Stream<String> -> Stream<Car>
        int sum = br.lines().map(f).filter(c -> c.getMonth()==6 &&
                c.getCar().equals("그랜저") && c.getCon()==2).mapToInt(Car::getQty).sum();
        System.out.println(sum);

        br  = new BufferedReader(new FileReader("product.txt"));
        br.lines().map(f).filter(c->c.getMonth() ==6 &&  c.getCar().equals("그랜저") && c.getCon()==2 ).forEach(s-> System.out.println(s));

    }
}














