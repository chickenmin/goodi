package chap11;
/*
*
* */
public class Wrapper2 {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println("i1 == i2: "+ (i1 == i2));
        Integer i3 = new Integer(100);
        Integer i4 = new Integer(100);
        System.out.println("i3 == i4: "+ (i3 == i4));

        int i5 = new Integer(100);  //unBoxing 발생
        System.out.println("i5 == i4 : "+(i5 == i4));   //i4 : unBoxing 발생

//        int형
        System.out.println("int 형의 최대값 : " + Integer.MAX_VALUE);
        System.out.println("int 형의 최소값 : " + Integer.MIN_VALUE);
        System.out.println("int 형의 bit크기 : " + Integer.SIZE);
//        byte
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);

//        문자열값을 숫자로 변경
        int i = Integer.parseInt("100");
        float f = Float.parseFloat("100.5");
        double d = Double.parseDouble("123.567");
        long l = Long.parseLong("12345678");
//        2, 8, 16 진수로 변경
        System.out.println("255의 2진수"+Integer.toBinaryString(255));
        System.out.println("255의 8진수"+Integer.toOctalString(255));
        System.out.println("255의 16진수"+Integer.toHexString(255));
//      8, 16 진수를 10진수로 변경
        i = Integer.parseInt("FF",16);
        System.out.println("16진수:FF => 10진수 : " + i);
        i = Integer.parseInt("377",8);
        System.out.println("8진수:377 => 10진수 : " + i);



















    }
}
