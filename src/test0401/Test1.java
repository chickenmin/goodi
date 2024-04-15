package test0401;

abstract class Animal {
    public String type;
    public int leg;

    public Animal(String type, int leg) { //추상클래스
        this.type = type;
        this.leg  = leg;
    }

    abstract void eat();    //추상메서드
    abstract void sound();
}//ANIMAL

class Dog extends Animal {
    public Dog() {
        super("갱얼쥐", 4);
    }

    @Override
    public void sound() {
        System.out.println("멍멍 짖는다.");
    }

    @Override
    public void eat() {
        System.out.println("사료를 먹는다");

    }
} // DOG
class Lion extends Animal {
    public Lion() {
        super("사자", 4);
    }

    @Override
    public void eat() {
        System.out.println("초식동물을 잡아먹는다.");
    }

    @Override
    public void sound() {
        System.out.println("어흥거린다");
    }
}

class Eagle extends Animal implements Flyable{
    public Eagle() {
        super("독수리", 2);
    }

    @Override
    void eat() {
        System.out.println("동물을 잡아먹는다");
    }

    @Override
    void sound() {
        System.out.println("위잉~");
    }

    @Override
    public void fly() {
        System.out.println("하늘을 난다.");
    }
}

interface Flyable{  //인터페이스
    void fly(); //public abstract 생략 : 추상메서드
}


public class Test1 {
    public static void main(String[] args) {
        Animal[] animal = new Animal[3];
        animal[0] = new Dog();
        animal[1] = new Lion();
        animal[2] = new Eagle();
        for (Animal a : animal) {
            System.out.print(a.type + ",다리수:" + a.leg + "개 =>");
            a.sound();
            a.eat();
            if(a instanceof Flyable) {
                ((Flyable) a).fly();
            }
        }
    }
}
