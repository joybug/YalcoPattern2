package factory_method.ex03;

/**
 * 신용카드 결제 객체 생성을 담당하는 구체적인 팩토리 클래스
 * - PaymentFactory를 상속받아 신용카드 전용 결제 객체 생성 구현
 * 
 * 주요 책임:
 * 1. 신용카드 결제 객체의 생성 로직 캡슐화
 * 2. 카드 정보 검증 및 초기화
 * 3. 카드사 시스템 연동을 위한 객체 구성
 * 
 * 사용 예시:
 * PaymentFactory factory = new CreditCardPaymentFactory();
 * Payment payment = factory.createPayment(userFinancialInfo);
 */
class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    Payment createPayment(FinancialInfo info) {
        return new CreditCardPayment(info.creditCardNumber);
    }
}
