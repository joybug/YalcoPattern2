package behavioral_patterns.strategy.ex01;

/**
 * PayPal 결제 전략 클래스
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}
