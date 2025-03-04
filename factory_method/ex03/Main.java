package factory_method.ex03;

/**
 * Main 클래스 - 클라이언트 코드
 * - 다양한 결제 방식을 실제로 사용하는 예제를 보여줌
 */
public class Main {
    public static void main(String[] args) {
        // 사용자의 금융 정보 초기화
        FinancialInfo userInfo = new FinancialInfo(
            "1234-5678-9012-3456",  // 신용카드 번호
            "user@example.com",      // PayPal 이메일
            "987654321"             // 은행 계좌번호
        );

        // 1. 신용카드 결제 테스트
        PaymentFactory factory = new CreditCardPaymentFactory();
        Payment payment = factory.createPayment(userInfo);
        payment.processPayment(100.0);

        // 2. PayPal 결제 테스트
        factory = new PayPalPaymentFactory();
        payment = factory.createPayment(userInfo);
        payment.processPayment(200.0);

        // 3. 계좌이체 결제 테스트
        factory = new BankTransferPaymentFactory();
        payment = factory.createPayment(userInfo);
        payment.processPayment(300.0);
    }
}