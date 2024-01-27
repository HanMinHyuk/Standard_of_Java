package ch6;

public class _27_BlockTest {
    static { // 클래스 초기화 블럭
        System.out.println("static {}");
    }

    { // 인스턴스 초기화 블럭
        System.out.println("{ }");
    }

    public _27_BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("_27_BlockTest bt = new _27_BlockTest();");
        _27_BlockTest bt = new _27_BlockTest();

        System.out.println("_27_BlockTest bt2 = new _27_BlockTest();");
        _27_BlockTest bt2 = new _27_BlockTest();
    }
}
