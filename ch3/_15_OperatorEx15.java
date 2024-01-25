package ch3;
// 소문자('a')를 대문자('A')로 바꾸기

public class _15_OperatorEx15 {
    public static void main(String[] args) {
        char lowerCase = 'a';
        char uppercase = (char)(lowerCase - 32);
        System.out.println(uppercase);
    }
}
