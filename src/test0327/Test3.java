package test0327;
class Animal{
    int age;
    String name;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info(){
        System.out.println(name + ":"+age +"살");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Animal a1 = new Animal("원숭이", 26);
        a1.info();
    }


}
