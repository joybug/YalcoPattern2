package factory_method.ex03;

/**
 * PayPalPaymentFactory 클래스
 * - PayPal 결제 객체를 생성하는 구체적인 공장 클래스
 */
class PayPalPaymentFactory extends PaymentFactory {
    @Override
    Payment createPayment(FinancialInfo info) {
        return new PayPalPayment(info.payPalEmail);
    }
}