package ch7;

public class _22_PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer_2 b = new Buyer_2();

        b.buy(new Tv_4());
        b.buy(new Computer_2());
        b.buy(new Audio());
        b.summary();
    }
}

class Product_2 {
    int price;          // 제품의 가격
    int bonusPoint;     // 제품구매 시 제공하는 보너스점수

    Product_2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
    }
}

class Tv_4 extends Product_2 {
    Tv_4() {
        // 조상클래스의 생성자 Product_2(int price)를 호출한다.
        super(100);     //Tv의 가격을 100만원으로 한다.
    }
    // Object클래서의 toString()을 오버라이딩 한다.
    public String toString() { return "Tv"; }
}

class Computer_2 extends Product_2 {
    Computer_2() { super(200); }

    public String toString() { return "Computer"; }
}

class Audio extends Product_2 {
    Audio() { super(50); }

    public String toString() { return "Audio"; }
}

class Buyer_2 {
    int money = 1000;
    int bonusPoint = 0;
    Product_2[] item = new Product_2[10]; // 구입한 제품을 저장하기 위한 배열
    int i = 0;                            // Product배열에 사용될 카운터

    void buy(Product_2 p) {
        if (money<p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;               // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;     // 제품의 보너스 점수를 추가한다.
        item[i++] = p;                  // 제품을 Product[] item에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {                    // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;                    // 구입한 물품의 가격합계
        String itemList = "";           // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i=0; i<item.length; i++) {
            if (item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("-----------------------------------------");
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

