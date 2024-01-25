package ch3;

public class _06_OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b); // '산술 연산자'는 두 개의 피연산자들의 자료형을 int형으로 변환한 다음 연산을 수행함 (자동 형변환 안됌). 그래서 형변환 연산자를 사용해서 변환해 주어야 함.
        System.out.println(c);
    }
}
