package factory_method.ex03;

/**
 * PayPalPaymentFactory 클래스
 * - PayPal 결제 객체를 생성하는 구체적인 공장 클래스
 * 
 * PayPal 결제 객체 생성을 담당하는 구체적인 팩토리 클래스
 * - PaymentFactory를 상속받아 PayPal 전용 결제 객체 생성 구현
 * 
 * 주요 책임:
 * 1. PayPal 결제 객체의 생성 로직 캡슐화
 * 2. PayPal 결제에 필요한 설정 및 초기화 처리
 * 3. PayPal API 연동을 위한 객체 구성
 */
class PayPalPaymentFactory extends PaymentFactory {
    /**
     * PayPal 결제 객체 생성 메서드
     * @param info 사용자의 PayPal 계정 정보를 포함한 금융 정보
     * @return 초기화된 PayPal 결제 객체
     */
    @Override
    Payment createPayment(FinancialInfo info) {
        return new PayPalPayment(info.payPalEmail);
    }
}