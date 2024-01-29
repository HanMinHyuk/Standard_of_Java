package ch7;

public class _18_BindingTest {
    public static void main(String[] args) {
        Parent_3 p = new Child_3();
        Child_3 c = new Child_3();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();

    }
}

class Parent_3 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child_3 extends Parent_3 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}