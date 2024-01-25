package ch3;
import java.util.*;

public class _25_OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력해주세요.>");

        String input = scanner.nextLine();
        ch = input.charAt(0); // String 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용하는 함수, 괄호 안에는 index 숫자를 넣어서 원하는 위치의 문자를 가져올 수 있음.

        if('0' <= ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다.%n");
        }

        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("입력하신 문자는 영문자입니다.%n");
        }
    }
}
