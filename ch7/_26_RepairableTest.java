package ch7;

public class _26_RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);       // SCV가 Tank를 수리하도록 한다.
        scv.repair(dropship);
//        scv.repair(marine);
    }
}

interface Repairable {}

class Unit_2 {
    int hitPoint;
    final int MAX_HP;
    Unit_2 (int hp) {
        MAX_HP = hp;
    }
    //...
}

class GroundUnit extends Unit_2 {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends Unit_2 {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);     // Tank의 HP는 150이다.
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
    //...
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);     // Dropship의 HP는 125이다.
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
    //...
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
    //...
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit_2) {
            Unit_2 u = (Unit_2)r;
            while(u.hitPoint != u.MAX_HP) {
                /* Unit의 HP를 증가시킨다. */
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }
    //...
}