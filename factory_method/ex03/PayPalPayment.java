package factory_method.ex03;

/**
 * PayPalPayment 클래스 (페이팔 결제)
 * - Payment 인터페이스를 구현한 구체적인 결제 처리 클래스
 * - PayPal 계정을 통한 결제 처리를 담당
 */
class PayPalPayment implements Payment {
    private String payPalEmail;  // PayPal 계정 이메일 저장

    /**
     * 생성자 - PayPal 계정 정보 초기화
     * @param payPalEmail PayPal 계정 이메일
     */
    public PayPalPayment(String payPalEmail) {
        this.payPalEmail = payPalEmail;
    }
    
    @Override
    public void processPayment(double amount) {
        // 실제 환경에서는 여기에 PayPal 결제 처리 로직이 구현됨
        System.out.println("PayPal: $" + amount);
    }
}
