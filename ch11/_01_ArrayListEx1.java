package ch11;
import java.util.*;

public class _01_ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5)); // list 안에 Integer 객체 생성
        list1.add(new Integer(4)); // list 안에 Integer 객체 생성
        list1.add(new Integer(2)); // list 안에 Integer 객체 생성
        list1.add(new Integer(0)); // list 안에 Integer 객체 생성
        list1.add(new Integer(1)); // list 안에 Integer 객체 생성
        list1.add(new Integer(3)); // list 안에 Integer 객체 생성

        ArrayList list2 = new ArrayList(list1.subList(1,4)); // 1번째 인덱스부터 4-1번째 인덱스 사이에 저장된 객체를 반환
        print(list1, list2);

        Collections.sort(list1); // list를 오름차순으로 정렬
        Collections.sort(list2);

        System.out.println("list1.contatinsAll(list2) : " + list1.containsAll(list2)); // list2 객체가 list1에 모두 포함되어 있는지 확인

        // boolean add(Object o) : ArrayList의 마지막에 객체를 추가, 성공하면 true
        // void add(int index, Object element) : 지정된 위치(index)에 객체를 저장
        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        // set(int index, Object element) : 주어진 객체(element)를 지정된 위치(index)에 저장한다.
        list2.set(3, "AA");
        print(list1, list2);
        list2.add(3, "A");
        print(list1, list2);
        // set() 과 add() 의 차이 : set은 지정된 위치에 객체가 있으면 삭제하고 그 위치에 주어진 객체를 저장하고
        // add는 지정된 위치에 객체가 있으면 한칸 뒤로 미루고 지정할려고 하는 객체를 지정된 위치에 집어 넣는다.

        // retainAll() : list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i=list2.size()-1; i>=0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    } // main의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
    }
}
