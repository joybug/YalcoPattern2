package factory_method.ex03;

/**
 * BankTransferPayment 클래스 (계좌이체 결제)
 * - Payment 인터페이스를 구현한 구체적인 결제 처리 클래스
 * - 은행 계좌이체를 통한 결제 처리를 담당
 */
class BankTransferPayment implements Payment {
    private String bankAccountNumber;  // 은행 계좌번호 저장

    /**
     * 생성자 - 은행 계좌 정보 초기화
     * @param bankAccountNumber 은행 계좌번호
     */
    public BankTransferPayment(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void processPayment(double amount) {
        // 실제 환경에서는 여기에 계좌이체 처리 로직이 구현됨
        System.out.println("Bank transfer: $" + amount);
    }
}
