package ch5;
// 배열을 활용하여 카드섞기

public class _07_ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i=0; i<numArr.length; i++) {
            numArr[i] = i; // 배열을 0~9의 숫자로 초기화한다.
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i<100; i++) {
            int n = (int)(Math.random() * 10); // 0~9중의 한 값을 임의로 얻는다.
            int tmp = numArr[0];   // 여기서 부터 밑에 두줄 까지는 numArr[0]과 numArr[n]의 값을 서로 바꿔주는 것이다.
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for (int i=0; i<numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
