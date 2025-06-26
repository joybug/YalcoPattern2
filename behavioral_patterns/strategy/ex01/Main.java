package behavioral_patterns.strategy.ex01;

/**
 * 전략 패턴 예제의 메인 클래스입니다.
 * <p>
 * ShoppingCart 객체에 다양한 결제 전략을 주입하여,
 * 결제 방식에 따라 동작이 달라지는 것을 확인할 수 있습니다.
 */
public class Main {
    /**
     * 프로그램의 시작점(main 메서드)
     * <p>
     * ShoppingCart 객체를 생성하고, 신용카드/PayPal 결제 전략을 각각 적용하여
     * 결제 동작을 테스트합니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // ShoppingCart 객체 생성
        ShoppingCart cart = new ShoppingCart();

        // 신용카드 결제 전략 설정 및 결제
        cart.setPaymentStrategy(
                new CreditCardPayment(
                        "John Doe",
                        "1234567890123456"
                )
        );
        cart.checkout(100); // 100 paid with credit card

        // PayPal 결제 전략 설정 및 결제
        cart.setPaymentStrategy(
                new PayPalPayment(
                        "johndoe@example.com"
                )
        );
        cart.checkout(200); // 200 paid using PayPal
    }
}
