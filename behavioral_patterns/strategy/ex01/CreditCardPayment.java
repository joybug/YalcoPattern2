package behavioral_patterns.strategy.ex01;

/**
 * 신용카드 결제 전략 클래스입니다.
 * <p>
 * PaymentStrategy 인터페이스를 구현하여 신용카드로 결제하는 방법을 정의합니다.
 */
public class CreditCardPayment implements PaymentStrategy {
    /**
     * 카드 소유자 이름
     */
    private String name;
    /**
     * 카드 번호
     */
    private String cardNumber;

    /**
     * CreditCardPayment 생성자입니다.
     * @param name 카드 소유자 이름
     * @param cardNumber 카드 번호
     */
    public CreditCardPayment(String name, String cardNumber) {
        // 필드 초기화
        this.name = name;
        this.cardNumber = cardNumber;
    }

    /**
     * 신용카드로 결제하는 동작을 수행합니다.
     * @param amount 결제할 금액
     */
    @Override
    public void pay(int amount) {
        // 실제 결제 로직 대신 안내 메시지 출력
        System.out.println(amount + " paid with credit card");
    }
}
