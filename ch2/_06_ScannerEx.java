package ch2;
import java.util.*;

public class _06_ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요. : ");
        String input = scanner.nextLine(); // 입력을 마치고 '엔터키'를 누르면 입력한 내용이 문자열로 반환됨.
        int num = Integer.parseInt(input); // 입력받은 문자열을 int 타입의 정수로 변환.

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d%n", num);
    }
}
