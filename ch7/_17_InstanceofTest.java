package ch7;

public class _17_InstanceofTest {
    public static void main(String[] args) {
        FireEngine_2 fe = new FireEngine_2();

        if (fe instanceof FireEngine_2) {
            System.out.println("This is a FireEngine instance.");
        }

        if (fe instanceof Car_3) {
            System.out.println("This is a Car instance.");
        }

        if (fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }

        System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력
    }
}

class Car_3 {}

class FireEngine_2 extends Car_3 {}

