package test0328.test0329.test1;

 abstract class Animal {
    public String type;
    public int leg;

    public Animal(String type, int leg) {
        this.type = type;
        this.leg  = leg;
    }

    abstract void eat();
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
public class AnimalMain {
    public static void main(String[] args) {
        Animal[] ani = new Animal[2];
        ani[0] = new Dog();
        ani[1] = new Lion();

        for (Animal a : ani) {
            System.out.print(a.type + ": 다리수 = "+a.leg + "개=>");
            a.sound();
            a.eat();

        }
    }

}
