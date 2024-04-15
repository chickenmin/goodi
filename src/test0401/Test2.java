package test0401;

interface RemoteControl{
    void turnOn();
    void turnOff();
    void setVolume(int volumn);
}
class Television implements RemoteControl{
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
    public void setVolume(int volumn) {
        System.out.println("Tv의 볼륨을 "+volumn+"으로 설정합니다.");
    }
}
class Audio implements RemoteControl{
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }
    public void setVolume(int volumn) {
        System.out.println("Audio의 볼륨을 "+volumn+"으로 설정합니다.");
    }
}
public class Test2 {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(10);
        rc.turnOff();
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(20);
        rc.turnOff();
    }
}
