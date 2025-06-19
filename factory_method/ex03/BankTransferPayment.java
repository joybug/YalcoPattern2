package factory_method.ex03;

/**
 * BankTransferPayment 클래스 (계좌이체 결제)
 * - Payment 인터페이스를 구현한 구체적인 결제 처리 클래스
 * - 은행 계좌 간 이체를 통한 결제 처리를 담당
 * 
 * 주요 기능:
 * 1. 은행 계좌 정보 관리
 * 2. 계좌이체 프로세스 처리
 * 3. 이체 결과 확인 및 검증
 */
class BankTransferPayment implements Payment {
    private String bankAccountNumber;  // 은행 계좌번호 저장

    /**
     * 생성자 - 은행 계좌 정보 초기화
     * - 이체에 사용될 계좌 정보를 설정
     * 
     * @param bankAccountNumber 은행 계좌번호
     */
    public BankTransferPayment(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    /**
     * 계좌이체 결제 처리 메서드
     * - 실제 은행 시스템과 연동하여 계좌이체 처리
     * 
     * @param amount 이체할 금액
     */
    @Override
    public void processPayment(double amount) {
        // 실제 환경에서는 여기에 계좌이체 처리 로직이 구현됨
        System.out.println("Bank transfer: $" + amount);
    }
}
