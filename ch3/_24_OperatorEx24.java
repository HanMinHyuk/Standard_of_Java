package ch3;

public class _24_OperatorEx24 {
    public static void main(String[] args) {
        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.println(10 < x && x < 20); // true

        x = 6;
        System.out.println(x%2==0 || x%3==0 && x%6!=0); // true , 이유 : 논리연산자는 &&부터 수행 됌.
        System.out.println((x%2==0 || x%3==0) && x%6!=0); // false , 이유 : 괄호가 있다면 괄호 안에 부터 수행 됌.

        ch = '1';
        System.out.println('0' <= ch && ch <= '9'); // true

        ch = 'a';
        System.out.println('a' <= ch && ch <= 'z'); // true

        ch = 'A';
        System.out.println('A' <= ch && ch <= 'Z'); // true

        ch = 'q';
        System.out.println(ch == 'q' || ch == 'Q'); // true
    }
}
