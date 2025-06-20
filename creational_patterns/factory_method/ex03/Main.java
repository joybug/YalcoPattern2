package factory_method.ex03;

/**
 * 결제 시스템 메인 클래스
 * - 팩토리 메서드 패턴을 활용한 결제 시스템 테스트
 * 
 * 주요 기능:
 * 1. 다양한 결제 방식 테스트
 * 2. 팩토리 메서드 패턴 활용 예시
 * 3. 결제 처리 흐름 시연
 * 
 * 실행 프로세스:
 * 1. 사용자 금융 정보 초기화
 * 2. 각 결제 방식별 팩토리 생성
 * 3. 결제 객체 생성 및 결제 처리
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