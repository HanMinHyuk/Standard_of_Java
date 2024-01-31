package ch7;

public class _20_BindingTest3 {
    public static void main(String[] args) {
        Parent_5 p = new Child_5();
        Child_5 c = new Child_5();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent_5 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child_5 extends Parent_5 {
    int x = 200;

    void method() {
        System.out.println("x = " + x);  // this.x와 같다
        System.out.println("super.x = " + super.x); // 조상클래스로 부터 상속받은 멤버변수 x를 뜻함.
        System.out.println("this.x = " + this.x); // 자손클래스에서 선언된 멤버변수 x
    }
}