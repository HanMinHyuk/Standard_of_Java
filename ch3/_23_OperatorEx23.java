package ch3;

public class _23_OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.println("abc" == "abc"); // true
        System.out.println(str1 == "abc"); // true
        System.out.println(str2 == "abc"); // false , 이유 : 내용은 같으나 서로 다른 객체이기 때문에 (equals()는 서로 다른 객체여도 내용이 같으면 true임)
        System.out.println(str1.equals("abc")); // true
        System.out.println(str2.equals("abc")); // true
        System.out.println(str2.equals("ABC")); // false , 이유 : Java는 대소문자를 구분함.
        System.out.println(str2.equalsIgnoreCase("ABC")); // true , 이유 : 저 메소드는 대소문자를 구분하지 않고 비교함.
    }
}
