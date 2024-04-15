package chap8;
/*
* 매개변수로 사용되는 인터페이스
* */

class Unit{
    int hitPoint;
    final int MAX_HP;

    Unit(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit{
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit{
    AirUnit(int hp) {
        super(hp);
    }
}

interface Repairable{}

class Tank extends GroundUnit implements  Repairable{
    Tank(){
        super(150);
    }
    public String toString(){
        return "tank";
    }
}

class DropShip extends AirUnit implements Repairable{
    DropShip(){
        super(125);
    }

    @Override
    public String toString() {
        return "DropShip";
    }
}

class Marine extends GroundUnit{
    public Marine() {
        super(40);
    }

    @Override
    public String toString() {
        return "Marine";
    }
}

class SCV extends GroundUnit implements Repairable{
    public SCV() {
        super(60);
    }

    void repair(Repairable r) {
        //MAX_HP값을 Unit의 HitPoint 값으로 저장
        Unit u = (Unit)r;
        u.hitPoint = u.MAX_HP;
        System.out.println(r + "의 수리 완료. hitPoint=" + u.hitPoint);
    }

    @Override
    public String toString() {
        return "SCV";
    }
}







public class InterfaceEx5 {
    public static void main(String[] args) {
        Unit[] uArr = new Unit[4];
        uArr[0] = new Tank();
        uArr[1] = new DropShip();
        uArr[2] = new Marine();
        uArr[3] = new SCV();

        SCV s = new SCV();
        for (Unit u : uArr) {
            if (u instanceof Repairable) {
                s.repair((Repairable) u);
            }
        }

    }
}


















