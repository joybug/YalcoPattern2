package factory_method.ex03;

/**
 * PayPalPayment 클래스 (페이팔 결제)
 * - Payment 인터페이스를 구현한 구체적인 결제 처리 클래스
 * - PayPal API를 통한 온라인 결제 처리를 담당
 * 
 * 주요 기능:
 * 1. PayPal 계정 정보 관리
 * 2. PayPal API를 통한 결제 처리
 * 3. 결제 상태 추적 및 처리
 */
class PayPalPayment implements Payment {
    private String payPalEmail;  // PayPal 계정 이메일 저장

    /**
     * 생성자 - PayPal 계정 정보 초기화
     * - PayPal 결제에 필요한 이메일 계정 정보를 설정
     * 
     * @param payPalEmail PayPal 계정 이메일 주소
     */
    public PayPalPayment(String payPalEmail) {
        this.payPalEmail = payPalEmail;
    }
    
    /**
     * PayPal 결제 처리 메서드
     * - PayPal API를 사용하여 실제 결제 처리
     * 
     * @param amount 결제할 금액
     */
    @Override
    public void processPayment(double amount) {
        // 실제 환경에서는 여기에 PayPal 결제 처리 로직이 구현됨
        System.out.println("PayPal: $" + amount);
    }
}
