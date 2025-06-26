package behavioral_patterns.strategy.ex01;

/**
 * PayPal 결제 전략 클래스입니다.
 * <p>
 * PaymentStrategy 인터페이스를 구현하여 PayPal로 결제하는 방법을 정의합니다.
 */
public class PayPalPayment implements PaymentStrategy {
    /**
     * PayPal 계정 이메일
     */
    private String email;

    /**
     * PayPalPayment 생성자입니다.
     * @param email PayPal 계정 이메일
     */
    public PayPalPayment(String email) {
        // 필드 초기화
        this.email = email;
    }

    /**
     * PayPal로 결제하는 동작을 수행합니다.
     * @param amount 결제할 금액
     */
    @Override
    public void pay(int amount) {
        // 실제 결제 로직 대신 안내 메시지 출력
        System.out.println(amount + " paid using PayPal");
    }
}
