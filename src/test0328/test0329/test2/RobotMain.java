package test0328.test0329.test2;

abstract class Robot {
    abstract void action();
}

class DanceRobot extends  Robot{
    @Override
    void action() {
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends  Robot{
    @Override
    void action() {
        System.out.println("노래를 부릅니다.");
    }
}
class DrawRobot extends  Robot{
    @Override
    void action() {
        System.out.println("그림을 그립니다.");
    }
}
public class RobotMain {
    public static void main(String[] args) {
        Robot[] bots = new Robot[3];
        bots[0] = new DanceRobot();
        bots[1] = new SingRobot();
        bots[2] = new DrawRobot();
        for(Robot r : bots) {
            r.action();
        }
    }
}
