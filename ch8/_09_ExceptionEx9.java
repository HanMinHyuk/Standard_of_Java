package ch8;

public class _09_ExceptionEx9 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시켰음.");
            throw e;      // 예외를 발생시킴.
//            throw new Exception("고의로 발생시켰음."); // 위의 두줄을 한줄로 줄여 쓸 수있다.
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            System.out.println("e = " + e);
        }
        System.out.println("프로그램이 정상 종료되었음");
    }
}
