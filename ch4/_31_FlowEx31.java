package ch4;
// continue문
// for문의 경우 증감식으로 이동함.
// while문과 do-while문의 경우 조건식으로 이동함.

public class _31_FlowEx31 {
    public static void main(String[] args) {
        for (int i=0; i <= 10; i++) {
            if (i%3==0)
                continue;
            System.out.println(i);
        }
    }
}
