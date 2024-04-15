package test0328.test0329.test3;
import test0328.test2.*;

class Buyer{
    int money = 10000, point, cnt;
    Food[] cart = new Food[6];
    int toF, toD, toS;
    {
        for (Food f : cart) {
            if (f instanceof Fruit) {
                toF += f.price;
            } else if (f instanceof Drink) {
                toD += f.price;
            } else if (f instanceof Snack) {
                toS += ((Snack) f).price;
            }
        }
    }

    void buy(Food food) {
        if (food.price > money) {
            System.out.println("잔액부족!!!");
            return;
        }
        money -= food.price;
        point += food.point;
        cart[cnt++] = food;

        String a = (food instanceof Fruit ? ((Fruit) food).brix +"당도" : food instanceof Drink? ((Drink) food).ml+"ml" : ((Snack)food).gram)+"g";

        System.out.println(food + "를(을)" + food.price + "가격에 구입");
        System.out.println(a + " 상품 구매");
//        if (food instanceof Fruit) {
//            System.out.println(food + "를(을) "+ food.price + "가격에 구입");
//            System.out.println(((Fruit) food).brix + "당도 상품 구매");
//        } else if (food instanceof Snack) {
//            System.out.println(food + "를(을) "+ food.price + "가격에 구입");
//            System.out.println(((Snack) food).gram+ "g 상품 구매");
//
//        } else if (food instanceof Drink) {
//            System.out.println(food + "를(을) " + food.price + "가격에 구입");
//            System.out.println(((Drink) food).ml+ "g 상품 구매");
//        }

    }

    void summary (){
        System.out.println("총 구매 금액: " + (10000-money));
        System.out.print("총 구매목록: ");

        for (int i = 0; i < cnt; i++) {
            System.out.print(cart[i] + ",");
        }// 총 구매목록

        System.out.println();

        System.out.print("과일 구매금액: " + toF + ", 과일 구매목록: ") ;
        for (Food f : cart) {
            if (f instanceof Fruit) {
                System.out.print(f + ",");
            }
        } // 과일
        System.out.println();
        System.out.print("음료 구매금액: " + toD + ", 음료 구매목록: ") ;
        for (Food f : cart) {
            if (f instanceof Drink) {
                System.out.print(f + ",");
            }
        } // 음료
        System.out.println();
        System.out.print("과자 구매금액: " + toS + ", 과자 구매목록: ") ;
        for (Food f : cart) {
            if (f instanceof Snack) {
                System.out.print(f + ",");
            }
        }//과자


    }

}
public class FoodMain {
    public static void main(String[] args) {
        Apple apple = new Apple(1000,10.5);//가격, 당도(brix)
        System.out.println("사과 가격:" + apple.price);
        System.out.println("사과 당도:" + apple.brix);
        Peach peach = new Peach(1000,13.5);//가격, 당도(brix)
        Cock cock = new Cock(500,500);   //가격, 용량(ml)
       Cider sidar = new Cider(1500,1000);//가격, 용량(ml)
        Biscuit bis = new Biscuit(10000,500);//가격, 무게(gram)
        Cookie cookie = new Cookie(500,5000);//가격, 무게(gram)

        Buyer b = new Buyer();
        b.buy(apple);		b.buy(peach);
        b.buy(cock);		b.buy(sidar);
        b.buy(bis);  		b.buy(cookie);
        System.out.println("고객 잔액:" + b.money);
        System.out.println("고객 포인트:" + b.point);
        b.summary();
    }
}
