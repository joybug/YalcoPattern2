package factory_method.ex03;

/**
 * BankTransferPaymentFactory 클래스
 * - 계좌이체 결제 객체를 생성하는 구체적인 공장 클래스
 */
class BankTransferPaymentFactory extends PaymentFactory {
    @Override
    Payment createPayment(FinancialInfo info) {
        return new BankTransferPayment(info.bankAccountNumber);
    }
}