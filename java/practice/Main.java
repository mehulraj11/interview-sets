public interface Payment {
    boolean initiatePayment(double amount);
    boolean verifyPayment(String transactionId);
    void refund(String transactionId);
}
public class CardPayment implements Payment {

    @Override
    public boolean initiatePayment(double amount) {
        System.out.println("Processing Card Payment of ₹" + amount);
        return true;
    }

    @Override
    public boolean verifyPayment(String transactionId) {
        System.out.println("Verifying Card Payment: " + transactionId);
        return true;
    }

    @Override
    public void refund(String transactionId) {
        System.out.println("Refunding Card Payment: " + transactionId);
    }
}
public class UPIPayment implements Payment {

    @Override
    public boolean initiatePayment(double amount) {
        System.out.println("Processing UPI Payment of ₹" + amount);
        return true;
    }

    @Override
    public boolean verifyPayment(String transactionId) {
        System.out.println("Verifying UPI Payment: " + transactionId);
        return true;
    }

    @Override
    public void refund(String transactionId) {
        System.out.println("Refunding UPI Payment: " + transactionId);
    }
}
public class WalletPayment implements Payment {

    @Override
    public boolean initiatePayment(double amount) {
        System.out.println("Processing Wallet Payment of ₹" + amount);
        return true;
    }

    @Override
    public boolean verifyPayment(String transactionId) {
        System.out.println("Verifying Wallet Payment: " + transactionId);
        return true;
    }

    @Override
    public void refund(String transactionId) {
        System.out.println("Refunding Wallet Payment: " + transactionId);
    }
}
public class PaymentService {

    private Payment payment;

    public PaymentService(Payment payment) {  // Dependency Injection
        this.payment = payment;
    }

    public void pay(double amount) {
        if (payment.initiatePayment(amount)) {
            payment.verifyPayment("TXN123");
        }
    }

    public void refund(String txnId) {
        payment.refund(txnId);
    }
}
public class Main {
    public static void main(String[] args) {

        Payment payment = new UPIPayment(); // choose any payment mode
        PaymentService service = new PaymentService(payment);

        service.pay(500.0);
        service.refund("TXN123");
    }
}

