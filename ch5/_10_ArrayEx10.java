package ch5;
// 배열을 활용하여 (오름차순, 내림차순) 정렬하기

public class _10_ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for (int i=0; i<numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random() * 10));
        }
        System.out.println();

        for (int i=0; i<numArr.length-1; i++) {
            boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.

            for (int j=0; j<numArr.length-1-i; j++) {
                if(numArr[j] > numArr[j+1]) {
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;
                }
            }
            if (!changed) break;

            for (int k=0; k<numArr.length; k++)
                System.out.print(numArr[k]); // 정렬된 결과를 출력한다.
            System.out.println();
        }
    }
}
