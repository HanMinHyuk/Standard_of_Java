package ch7;
import java.util.Vector;

public class _23_PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer_3 b = new Buyer_3();
        Tv_5 tv = new Tv_5();
        Computer_3 com = new Computer_3();
        Audio_2 audio = new Audio_2();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}

class Product_3 {
    int price;          // 제품의 가격
    int bonusPoint;     // 제품구매 시 제공하는 보너스점수

    Product_3(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
    }
}

class Tv_5 extends Product_3 {
    Tv_5() {
        // 조상클래스의 생성자 Product_3(int price)를 호출한다.
        super(100);     //Tv의 가격을 100만원으로 한다.
    }
    // Object클래서의 toString()을 오버라이딩 한다.
    public String toString() { return "Tv"; }
}

class Computer_3 extends Product_3 {
    Computer_3() { super(200); }

    public String toString() { return "Computer"; }
}

class Audio_2 extends Product_3 {
    Audio_2() { super(50); }

    public String toString() { return "Audio"; }
}

class Buyer_3 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector 객체
    int i = 0;                            // Product배열에 사용될 카운터

    void buy(Product_3 p) {
        if (money<p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;               // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;     // 제품의 보너스 점수를 추가한다.
        item.add(p);                // 구입한 제품을 Vector에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product_3 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {                    // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;                    // 구입한 물품의 가격합계
        String itemList = "";           // 구입한 물품목록

        if (item.isEmpty()) {           // Vector가 비어있는지 확인
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i=0; i<item.size(); i++) {
            Product_3 p = (Product_3)item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("-----------------------------------------");
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

