package PaymentStategy.Concrete;

import PaymentStategy.Payment;
import PaymentStategy.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {
    public CreditCardPayment(double fee) {
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}
