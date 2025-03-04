package factory_method.ex03;

/**
 * CreditCardPayment 클래스 (신용카드 결제)
 * - Payment 인터페이스를 구현한 구체적인 결제 처리 클래스
 * - 신용카드를 통한 결제 처리를 담당
 */
class CreditCardPayment implements Payment {
    private String creditCardNumber;  // 신용카드 번호 저장

    /**
     * 생성자 - 신용카드 정보 초기화
     * @param creditCardNumber 신용카드 번호
     */
    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    @Override
    public void processPayment(double amount) {
        // 실제 환경에서는 여기에 신용카드 결제 처리 로직이 구현됨
        System.out.println("Credit card: $" + amount);
    }
}
