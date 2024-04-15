package test0326;

class Animal{
    String name;
    int age;
    void eat(){
        System.out.println("맛있게 얌얌");
    }
    public String toString() {
        return "이름(name):" + name +"\n"+"나이(age):"+age;
    }


}
public class Test4 {
    public static void main(String[] args) {
        Animal monkey = new Animal();
        monkey.name = "원숭이";
        monkey.age = 20;

        System.out.println(monkey);
        monkey.eat();
    }
}
