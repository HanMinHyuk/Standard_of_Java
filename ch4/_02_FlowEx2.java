package ch4;
import java.util.*;

public class _02_FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.print("숫자를 하나 입력하세요. > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
        input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환

        if (input==0) {
            System.out.println("입력하신 숫자는 0입니다.");
        }

        if (input!=0)  // 괄호를 추가하지 않으면 첫번쨰 문장만 if문에 속해짐.
            System.out.println("입력하신 숫자는 0입니다.");
            System.out.printf("입력하신 숫자는 %d입니다.", input);
    }
}
