package chap15;

/*
* Supplier 관련 인터페이스
* T getXXX() : 매개변수는 없고 리턴값만 존재
*
* Supplier <T> : T get() : T형의 값을 리턴함
* BooleanSupplier : boolean getAsBoolean()
* DoubleSupplier : double getAsDouble()
* IntSupplier : int getAsInt()
* LongSupplier : long getAsInt()
*
* */

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Lambda3 {
    public static void main(String[] args) {
        Supplier<String> s1 = ()-> {return "java";};
        System.out.println(s1.get());

        IntSupplier is = ()-> (int)(Math.random()*6)+1;
        System.out.println(is.getAsInt());

        double[] arr = {1,1.2,2.4,5.3,10,3};
        DoubleSupplier ds = () ->{
            double sum = 0;
            for (double v : arr) {
                sum += v;
            }
            return sum;
        };
        System.out.println(ds.getAsDouble());

    }
}
