package Java.chapter04.inheritance;

// VIPCustomer 클래스는 Customer 클래스를 상속받음
public class VIPCustomer extends Customer {
    private int agentID;  // VIP 고객 상담원 아이디
    double saleRatio;  // 할인율

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }
}
