package Java.Class;

public class ShoppingMall {
    String num;
    String id;
    String data;
    String name;
    String itemNum;
    String address;

    public static void main(String[] args) {
        ShoppingMall one = new ShoppingMall();

        one.num = "201803120001";
        one.id = "abc123";
        one.data = "2018년 3월 12일";
        one.name = "홍길순";
        one.itemNum = "PD0345-12";
        one.address = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문 번호 : " + one.num);
        System.out.println("주문자 아이디 : " + one.id);
        System.out.println("주문 날짜 : " + one.data);
        System.out.println("주문자 이름 : " + one.name);
        System.out.println("주문 상품 번호 : " + one.itemNum);
        System.out.println("배송 주소 : " + one.address);
    }
}
