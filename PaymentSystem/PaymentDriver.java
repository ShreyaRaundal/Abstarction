package PaymentSystem;

public class PaymentDriver {
    public static void main(String[] args) {
        // Can be change to UPI

        Payment p2=new CreditCard();
        p2.pay(700);
    }
}
