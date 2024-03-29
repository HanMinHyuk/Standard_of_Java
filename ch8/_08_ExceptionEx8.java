package ch8;

public class _08_ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);      // 예외 발생
            System.out.println(4);        // 실행되지 않는다.
        } catch (ArithmeticException ae) {
            System.out.println(ae); // ae.printStackTrace(); 와 같다
            System.out.println("예외메시지 : " + ae.getMessage());
        }
        System.out.println(6);
    } // main의 끝
}

