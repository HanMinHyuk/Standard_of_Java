package ch8;

public class _14_ExceptionEx14 {
    static void method1() throws Exception {  // 2. 처리할 수 없는 메소드이므로 자기를 호출한 메서드(main 메서드) 한테 예외처리를 떠맡김
        throw new Exception();          // 1. Exception을 강제적으로 발생시킨다.
    }

    public static void main(String[] args) {   // 3. 나한테 왔으니 예외처리를 한다.
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
