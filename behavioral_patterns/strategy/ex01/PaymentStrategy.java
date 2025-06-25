package behavioral_patterns.strategy.ex01;

/**
 * 결제 전략을 위한 인터페이스
 */
public interface PaymentStrategy {
    void pay(int amount);
}
