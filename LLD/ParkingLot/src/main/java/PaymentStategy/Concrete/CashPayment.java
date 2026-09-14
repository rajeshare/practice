package PaymentStategy.Concrete;

import PaymentStategy.Payment;
import PaymentStategy.PaymentStrategy;

public class CashPayment implements PaymentStrategy {
    public CashPayment(double fee) {
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
