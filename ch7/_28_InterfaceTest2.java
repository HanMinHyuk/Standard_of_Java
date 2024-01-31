package ch7;

class A_2 {
    void autoPlay(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B_2 implements I {
    public void play() {
        System.out.println("play in B class");
    }
}

class C implements I {
    public void play() {
        System.out.println("play in C class");
    }
}

public class _28_InterfaceTest2 {
    public static void main(String[] args) {
        A_2 a = new A_2();
        a.autoPlay(new B_2());      // void autoPlay(I i) 호출
        a.autoPlay(new C());        // void autoPlay(I i) 호출
    }
}
