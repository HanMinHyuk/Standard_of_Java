package ch2;

public class _08_SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');            // \' : 작은따옴표 출력, '''처럼 할 수 없다.
        System.out.println("abc\t123\b456"); // \t : 띄어쓰기, \b : 3이 지워짐.
        System.out.println('\n');            // 개행(new line)문자 출력하고 개행
        System.out.println("\"Hello\"");     // \" : 큰따옴표 출력
        System.out.println("c : \\");        // 역슬래쉬(\)
    }
}
