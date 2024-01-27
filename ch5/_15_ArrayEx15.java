package ch5;
// 문자열(String)을 모르스(morse)부호로 변환하는 예제

public class _15_ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", "."
                        , "..-.", "--.", "....", "..", ".---"
                        , "-.-", ".-..", "--", "-.", "---"
                        , ".--.", "--.-", ".-.", "...", "-"
                        , "..-", "...-", ".--", "-..-", "-.--"
                        , "--.."};
        String result ="";

        for (int i=0; i<source.length();i++) {
            result += morse[source.charAt(i) - 'A'];
        }
        System.out.println("source : " + source);
        System.out.println("morse : " + result);
    }
}
