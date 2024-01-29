package ch7;

public class _19_BindingTest2 {
    public static void main(String[] args) {
        Parent_4 p = new Child_4();
        Child_4 c = new Child_4();

        System.out.println("p.x = " + p.x);
        p.method();

        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent_4 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child_4 extends Parent_4 { }
