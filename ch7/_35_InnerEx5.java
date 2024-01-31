package ch7;

class Outer_2 {
    int value = 10; // Outer.this.value

    class Inner {
        int value = 20; // this.value

        void method1() {
            int value = 30;
            System.out.println("           value : " + value);
            System.out.println("      this.value : " + this.value);
            System.out.println("Outer.this.value : " + Outer_2.this.value);
        }
    } // Inner 클래스 끝
} // Outer 클래스 끝

public class _35_InnerEx5 {
    public static void main(String[] args) {
        Outer_2 outer = new Outer_2();
        Outer_2.Inner inner = outer.new Inner();
        inner.method1();
    }
} // InnerEx5 끝
