package ch2;

public class _04_PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; // long big = 100000000000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010; // 8 진수 10, 10진수로는 8
        int hexNum = 0x10; // 16 진수 10, 10진수로는 16
        int binNum = 0b10; // 2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger); // 우측정렬, 최소 5글자 출력공간 확보
        System.out.printf("finger=[%-5d]%n", finger); // 좌측정렬, 최소 5글자 출력공간 확보
        System.out.printf("finger=[%05d]%n", finger); // 우측정렬, 최소 5글자 출력공간 확보, 나머지 공백은 0으로 채움
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex); // %x : 16진 정수의 형식으로 출력 (소문자로), '#' : 접두사 (16진수 0x, 8진수 0)
        System.out.printf("hex=%#X%n", hex); // %X : 16진 정수의 형식으로 출력 (대문자로), '#' : 접두사 (16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNum, octNum); // %o : 8진 정수의 형식으로 출력
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // %x : 16진 정수의 형식으로 출력
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // Integer.toBinaryString : 10진수를 2진 문자열로 반환
    }
}
