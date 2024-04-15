package chap7;
/*
* 다형성 예제
*  product 클래스
*   멤버변수:가격(price), 포인트(point)
*   생성자 : 가격을 입력받고, 가격의 10퍼센트를 포인트로 저장*/

class Product{
    int price, point;
    int a = 10;

    public Product(int price) {
        this.price = price;
        this.point = price /10;
    }
}

class Tv extends Product{
    public Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class HandPhone extends Product{
    public HandPhone() {
        super(150);
    }

    @Override
    public String toString() {
        return "HandPhone";
    }
}




public class ProductEx1 {
    public static void main(String[] args) {
        Product[] parr = new Product[3];

        parr[0] = new Tv();
        parr[1] = new Computer();
        parr[2] = new HandPhone();

        int toPrice = 0, toPoint = 0;
        for (Product product : parr) {
            System.out.println(product+":"+product.price +","+product.price);
            toPoint += product.point;
            toPrice += product.price;
        }
        System.out.println("포인트: " + toPoint);
        System.out.println("가격: " + toPrice);
        System.out.println(parr[2].a);
    }



}











