package behavioral_patterns.strategy.ex01;

/**
 * 결제 컨텍스트(쇼핑카트) 클래스입니다.
 * <p>
 * 결제 전략(PaymentStrategy)을 주입받아, 다양한 결제 방식을 사용할 수 있도록 합니다.
 */
public class ShoppingCart {
    /**
     * 현재 사용 중인 결제 전략 객체
     */
    private PaymentStrategy paymentStrategy;

    /**
     * 결제 전략을 설정합니다.
     * @param paymentStrategy 사용할 결제 전략 객체
     */
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        // 결제 전략 변경
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * 결제 동작을 수행합니다.
     * 현재 설정된 결제 전략의 pay() 메서드를 호출합니다.
     * @param amount 결제할 금액
     */
    public void checkout(int amount) {
        // 결제 전략에 따라 결제 동작 위임
        paymentStrategy.pay(amount);
    }
}
