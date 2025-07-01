package PaymentSystem;

class UPI implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid "+amount +" via UPI.");
    }
}