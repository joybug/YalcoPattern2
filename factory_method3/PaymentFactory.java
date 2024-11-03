package factory_method3;

/**
 * PaymentFactory 추상 클래스
 * - 결제 객체 생성을 위한 추상 팩토리 클래스
 * - 팩토리 메서드 패턴에서 '추상 생산자(Abstract Creator)' 역할
 */
abstract class PaymentFactory {
    /**
     * 결제 객체를 생성하는 팩토리 메서드
     * @param info 사용자의 금융 정보
     * @return 생성된 Payment 객체
     */
    abstract Payment createPayment(FinancialInfo info);
}