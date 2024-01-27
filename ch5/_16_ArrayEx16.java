package ch5;
// 커맨드 라인을 이용한 연습 1

public class _16_ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수 " +args.length);
        for (int i=0; i<args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
