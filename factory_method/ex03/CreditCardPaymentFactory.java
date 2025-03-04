package factory_method.ex03;

/**
 * CreditCardPaymentFactory 클래스
 * - 신용카드 결제 객체를 생성하는 구체적인 공장 클래스
 */
class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    Payment createPayment(FinancialInfo info) {
        return new CreditCardPayment(info.creditCardNumber);
    }
}
