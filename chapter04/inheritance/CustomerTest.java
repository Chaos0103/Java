package Java.chapter04.inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        // customerID와 customerName은 protected 변수이므로 set() 메서드 호출
        customerLee.setCustomerID(10010);
        customerLee.setCustomerName("이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.getCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        // customerID와 customerName은 protected 변수이므로 set() 메서드 호출
        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.getCustomerInfo());
    }
}
