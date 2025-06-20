package factory_method.ex03;

/**
 * 계좌이체 결제 객체 생성을 담당하는 구체적인 팩토리 클래스
 * - PaymentFactory를 상속받아 계좌이체 전용 결제 객체 생성 구현
 * 
 * 주요 책임:
 * 1. 계좌이체 결제 객체의 생성 로직 캡슐화
 * 2. 은행 계좌 정보 검증 및 초기화
 * 3. 은행 시스템 연동을 위한 객체 구성
 */
class BankTransferPaymentFactory extends PaymentFactory {
    /**
     * 계좌이체 결제 객체 생성 메서드
     * @param info 사용자의 은행 계좌 정보를 포함한 금융 정보
     * @return 초기화된 계좌이체 결제 객체
     */
    @Override
    Payment createPayment(FinancialInfo info) {
        return new BankTransferPayment(info.bankAccountNumber);
    }
}