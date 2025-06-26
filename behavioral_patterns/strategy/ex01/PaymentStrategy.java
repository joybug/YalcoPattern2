package behavioral_patterns.strategy.ex01;

/**
 * 결제 전략을 위한 인터페이스입니다.
 * <p>
 * 다양한 결제 방식(신용카드, PayPal 등)을 전략 패턴으로 구현할 때 사용합니다.
 * 각 결제 방식별로 pay() 메서드의 동작이 다르게 구현됩니다.
 */
public interface PaymentStrategy {
    /**
     * 결제 동작을 수행합니다.
     * @param amount 결제할 금액
     */
    void pay(int amount);
}
