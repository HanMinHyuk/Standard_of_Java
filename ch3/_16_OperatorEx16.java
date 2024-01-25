package ch3;
//나눗셈의 결과를 반올림 하는 것이 아닌 버리는 것

public class _16_OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println(shortPi);
    }
}
