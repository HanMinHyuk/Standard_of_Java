package ch3;



public class _28_OperatorEx28 {
    public static void main(String[] args) {
        int x = 0xAB, y = 0xF;

        System.out.printf("x = %#X \t\t\t%s%n", x, toBinaryString(x));
        System.out.printf("y = %#X \t\t\t%s%n", y, toBinaryString(y));

        System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
        System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
        System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));

    }

    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x); // Integer.toBinaryString() -> 10진수를 2진수로 바꿔주는 역할
        return tmp.substring(tmp.length()-32);
    }
}
