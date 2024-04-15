package chap7;

class Buyer {
    int money =500, point;
    int cnt;
    Product[] cart = new Product[5];
    void buy(Product product) {
        money -= product.price;
        this.point += product.point;
        cart[cnt++] = product;
        System.out.println(product + "구입");
    }

    void summary(){
        //1. 구매 제품의 전체 금액의 합계, 포인트 합계
        int toPoint=0, toPrice=0;
        for (int i = 0; i < cnt; i++) {
            toPrice += cart[i].price;
            toPoint += cart[i].point;

        }
        System.out.println("구매 제품 전체 가격: "+toPoint);
        System.out.println("구매 제품 전체 포인트: " +toPrice);

        //2. 잔액 출력
        System.out.println("구매 후 잔액: " + money);

        // 3. 전체 구매 물품 이름 출력
        System.out.print("구매 물품 목록: ");
        for (int i = 0; i < cnt; i++) {
            System.out.print(cart[i] + ",");
        }
        System.out.println();

        System.out.println("구매 후 포인트: " + point);


    }
}
public class ProductEx2 {
    public static void main(String[] args) {
        Tv t = new Tv();
        Computer c = new Computer();
        HandPhone h = new HandPhone();
        Buyer b = new Buyer();
        b.buy(t);   b.buy(c);     b.buy(h);
        b.summary();
    }
}














