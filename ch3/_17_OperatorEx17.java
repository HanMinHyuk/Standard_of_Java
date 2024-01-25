package ch3;
//나눗셈의 결과를 반올림 하여 보여준 것

public class _17_OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;

        System.out.println(shortPi);
    }
}
