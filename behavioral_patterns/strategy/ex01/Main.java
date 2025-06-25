package behavioral_patterns.strategy.ex01;

/**
 * 전략 패턴 예제의 메인 클래스
 */
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(
                new CreditCardPayment(
                        "John Doe",
                        "1234567890123456"
                )
        );
        cart.checkout(100);
        // 100 paid with credit card

        cart.setPaymentStrategy(
                new PayPalPayment(
                        "johndoe@example.com"
                )
        );
        cart.checkout(200);
        // 200 paid using PayPal
    }
}
