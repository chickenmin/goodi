package test0328.test2;

public class FoodMain {
    public static void main(String[] args) {
        Apple apple = new Apple(1000,10.5);//가격, 당도(brix)
        System.out.println("사과 가격:" + apple.price);
        System.out.println("사과 당도:" + apple.brix);
        Peach peach = new Peach(1000,13.5);//가격, 당도(brix)
        System.out.println(peach.toString());
        Cock cock = new Cock(500,500);   //가격, 용량(ml)
        System.out.println(cock.toString());
        Cider sidar = new Cider(1500,1000);//가격, 용량(ml)
        System.out.println(sidar.toString());
        Biscuit bis = new Biscuit(10000,500);//가격, 무게(gram)
        System.out.println(bis.toString());
        Cookie cookie = new Cookie(500,5000);//가격, 무게(gram)
        System.out.println(cookie.toString());
    }
}
