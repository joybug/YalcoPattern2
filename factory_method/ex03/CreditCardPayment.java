package factory_method.ex03;

/**
 * CreditCardPayment 클래스 (신용카드 결제)
 * - Payment 인터페이스를 구현한 구체적인 결제 처리 클래스
 * - 신용카드를 통한 결제 처리를 담당
 * 
 * 주요 기능:
 * 1. 신용카드 정보 저장 및 관리
 * 2. 신용카드 결제 프로세스 처리
 * 3. 결제 금액에 대한 신용카드 승인 처리
 */
class CreditCardPayment implements Payment {
    private String creditCardNumber;  // 신용카드 번호 저장

    /**
     * 생성자 - 신용카드 정보 초기화
     * @param creditCardNumber 신용카드 번호
     * - 결제에 사용될 신용카드 번호를 받아 초기화
     * - 실제 환경에서는 카드 유효성 검증 등의 추가 로직이 포함될 수 있음
     */
    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    /**
     * 신용카드 결제 처리 메서드
     * @param amount 결제할 금액
     * - 실제 신용카드 결제 처리 로직이 구현되어야 함
     * - 카드사 API 호출, 승인 번호 발급 등의 프로세스가 포함될 수 있음
     */
    @Override
    public void processPayment(double amount) {
        // 실제 환경에서는 여기에 신용카드 결제 처리 로직이 구현됨
        System.out.println("Credit card: $" + amount);
    }
}
