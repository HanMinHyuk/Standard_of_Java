package ch2;

public class _05_PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f; // 0.10, 1.0e-1
        float f2 = 1e1f; // 10.0. 1.0e1, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // %e : 지수형태로 출력, %g : 값을 간략하게 표현할 때
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
        System.out.printf("f2=%f, %e, %g%n", f3, f3, f3);

        System.out.printf("d=%f%n", d); // %f는 기본적으로 소수점 아래 6자리까지만 출력. so, 소수점 아래 7자리에서 반올림함.
        System.out.printf("d=%.3f%n", d); // 소수점 아래 3자리까지만 출력, 소수점 아래 4자리에서 반올림함.
        System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
        System.out.printf("d=%014.10f%n", d); // 전체 14자리 중 소수점 10자리, 양쪽 빈자리를 모두 0으로 채워줌.

        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url); // 우측정렬, 최소 20글자 출력공간 확보
        System.out.printf("[%-20s]%n", url); // 좌측정렬, 최소 20글자 출력공간 확보
        System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력

    }
}
