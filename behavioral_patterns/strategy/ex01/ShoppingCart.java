package behavioral_patterns.strategy.ex01;

/**
 * 결제 컨텍스트(쇼핑카트) 클래스
 */
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
