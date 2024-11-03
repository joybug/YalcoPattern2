package factory_method3;

/**
 * Payment 인터페이스
 * - 모든 결제 방식이 구현해야 하는 공통 인터페이스
 * - 팩토리 메서드 패턴에서 '추상 제품(Abstract Product)' 역할
 */
interface Payment {
    // 결제 처리를 위한 메서드
    void processPayment(double amount);
}
