package ch7;

public class _12_FinalCardTest {
    public static void main(String[] args) {
        Card_2 c2 = new Card_2("HEART", 10);
//        c2.NUMBER = 5;
        System.out.println(c2.KIND);
        System.out.println(c2.NUMBER);
        System.out.println(c2); // System.out.println(c2.toString());
    }
}

class Card_2 {
    final int NUMBER;               // 상수지만 선언과 함께 초기화 하지 않고
    final String KIND;              // 생성자에서 단 한번만 초기화할 수 있다.
    static int width = 100;
    static int height = 250;

    Card_2(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card_2() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

