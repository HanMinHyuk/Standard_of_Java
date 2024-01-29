package ch7;

public class _16_CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car; // 에러!!! 참조변수 car가 참조하고 있는 인스턴스가 Car타입의 인스턴스라는데 있다.
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
