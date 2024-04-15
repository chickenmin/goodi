package chap8;
/*
* 단일 상속의 보완에 사용되는 인터페이스*/

abstract class Animal{
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();
}

interface Flyable {
    void fly();
}

class Dove extends Animal implements Flyable{
    Dove(){
        super("비둘기");
    }


    @Override
    void eat() {
        System.out.println(name + "은 하늘을 날 수 있다");
    }

    @Override
    public void fly() {
        System.out.println(name + "은 벌레를 잡아먹는다.");

    }
}

class Monkey extends Animal{
    public Monkey() {
        super("원숭이");
    }

    void eat(){
        System.out.println(name + "은 나무에서 열매를 따먹는다.");
    }
}

/*
* Animal 타입의 참조변수로 두개를 배열로 설정하여 첫번째는 Dove 객체, 두번째는 원숭이 객체를 저장
* [결과]
* 벌레를 잡아먹는다.
*
* */
public class InterfaceEx3 {
    public static void main(String[] args) {
        Animal[] ani = new Animal[2];
        ani[0] = new Dove();
        ani[1] = new Monkey();

        ani[0].eat();
        ((Dove)ani[0]).fly();
        ani[1].eat();

        for (Animal a : ani) {
            a.eat();
            //ClassCastExeption : 참조변수의 자료형으로 객체 참조가 불가 한 경우 발생 예외
            if (a instanceof  Flyable) {
                Flyable f = (Flyable) a;
                f.fly();
            }
        }


    }
}



















