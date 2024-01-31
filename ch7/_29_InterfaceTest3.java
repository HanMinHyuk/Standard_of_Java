package ch7;

public class _29_InterfaceTest3 {
    public static void main(String[] args) {
        A_3 a = new A_3();
        a.methodA();
    }
}

class A_3 {
    void methodA() {
        I_2 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString()); // i로 Object클래스의 메서드 호출 가능
    }
}

interface I_2 {
    public abstract void methodB();
}

class B_3 implements I_2 {
    public void methodB() {
        System.out.println("methodB in B class");
    }

    public String toString() { return "class B"; }
}

class InstanceManager {
    public static I_2 getInstance() {
        return new B_3();
    }
}