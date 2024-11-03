package factory_method3;

/**
 * FinancialInfo 클래스
 * - 사용자의 모든 금융 정보를 포함하는 데이터 클래스
 * - 여러 결제 방식에 필요한 정보들을 한 곳에서 관리
 */
class FinancialInfo {
    String creditCardNumber;    // 신용카드 번호
    String payPalEmail;        // PayPal 이메일
    String bankAccountNumber;  // 은행 계좌번호

    /**
     * 생성자 - 모든 금융 정보 초기화
     * @param creditCardNumber 신용카드 번호
     * @param payPalEmail PayPal 이메일
     * @param bankAccountNumber 은행 계좌번호
     */
    public FinancialInfo(
        String creditCardNumber, 
        String payPalEmail, 
        String bankAccountNumber
    ) {
        this.creditCardNumber = creditCardNumber;
        this.payPalEmail = payPalEmail;
        this.bankAccountNumber = bankAccountNumber;
    }
}