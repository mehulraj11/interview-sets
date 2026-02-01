interface Payment {

    void pay(int amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

class PaymentService {
    private Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void makePayment(int amount) {
        payment.pay(amount);
    }
}

public class Di {
    public static void main(String[] args) {
        Payment p1 = new UpiPayment();
        Payment p2 = new CreditCardPayment();

        PaymentService ps1 = new PaymentService(p1);
        PaymentService ps2 = new PaymentService(p2);

        ps1.makePayment(5000);
        ps2.makePayment(100000);

    }
}
