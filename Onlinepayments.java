class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}
class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using UPI");
    }
}
class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}
public class Onlinepayments {
    public static void main(String[] args) {
        Payment p;
        p = new UPI();
        p.pay();
        p = new CreditCard();
        p.pay();
    }
}