package ch5;
// 배열을 활용하여 배열에 어떤 값이 몇 개 저장되어 있는지 세어서 보여주기

public class _11_ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for (int i=0; i<numArr.length; i++) {
            numArr[i] = (int)(Math.random() * 10); // 0~9의 임의의 수를 배열에 저장
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i<numArr.length; i++) {
            counter[numArr[i]]++;
        }

        for (int i=0; i<numArr.length; i++) {
            System.out.println(i + "의 개수 : " + counter[i]);
        }
    }

}
