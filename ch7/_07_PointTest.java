package ch7;

public class _07_PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1,2,3);
    }
}

class Point_2 {
    int x, y;

    Point_2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }

    Point_2() {} // 에러를 없애기 위해 생성자 추가

}

class Point3D extends Point_2 {
    int z;

    Point3D(int x, int y, int z) { // 오류가 뜨는 이유는 조상 클래스의 생성자인 Point_2()를 찾을 수 없기 때문

        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}
