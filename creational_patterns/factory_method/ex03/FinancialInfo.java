package factory_method.ex03;

/**
 * FinancialInfo 클래스
 * - 결제에 필요한 모든 금융 정보를 포함하는 데이터 클래스
 * 
 * 목적:
 * 1. 다양한 결제 방식에 필요한 금융 정보를 하나의 객체로 캡슐화
 * 2. 결제 정보의 일관된 전달과 관리
 * 3. 새로운 결제 방식 추가 시 쉽게 확장 가능
 * 
 * 사용자의 금융 정보를 관리하는 데이터 클래스
 * - 다양한 결제 방식에 필요한 모든 금융 정보를 포함
 * 
 * 포함하는 정보:
 * 1. 신용카드 정보 - 카드 결제 시 사용
 * 2. PayPal 계정 정보 - PayPal 결제 시 사용
 * 3. 은행 계좌 정보 - 계좌이체 시 사용
 * 
 * 데이터 보안:
 * - 실제 환경에서는 암호화 처리 필요
 * - 민감한 금융 정보의 안전한 관리 필요
 * 
 * 사용 예시:
 * FinancialInfo info = new FinancialInfo("1234-5678", "user@mail.com", "9876-5432");
 */
class FinancialInfo {
    String creditCardNumber;    // 신용카드 번호
    String payPalEmail;        // PayPal 이메일
    String bankAccountNumber;  // 은행 계좌번호

    /**
     * 생성자 - 모든 금융 정보 초기화
     * - 다양한 결제 수단에 필요한 정보를 한번에 초기화
     * 
     * @param creditCardNumber 신용카드 번호 (카드 결제용)
     * @param payPalEmail PayPal 이메일 (PayPal 결제용)
     * @param bankAccountNumber 은행 계좌번호 (계좌이체용)
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