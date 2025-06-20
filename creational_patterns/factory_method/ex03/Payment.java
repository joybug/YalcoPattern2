package factory_method.ex03;

/**
 * Payment 인터페이스
 * - 모든 결제 방식이 구현해야 하는 공통 인터페이스
 * - 팩토리 메서드 패턴에서 '추상 제품(Abstract Product)' 역할
 * - 다양한 결제 방식(신용카드, PayPal, 계좌이체 등)에 대한 공통 규약 정의
 * 
 * 사용 목적:
 * 1. 모든 결제 방식에 대한 일관된 인터페이스 제공
 * 2. 새로운 결제 방식 추가 시 쉽게 확장 가능
 * 3. 클라이언트 코드가 구체적인 결제 방식을 알 필요 없음
 */
interface Payment {
    /**
     * 결제 처리를 위한 메서드
     * 
     * @param amount 결제할 금액
     * - 각 결제 방식별로 이 메서드를 구현하여 실제 결제 처리 로직 구현
     * - 결제 금액을 파라미터로 받아 해당 금액만큼 결제 처리
     */
    void processPayment(double amount);
}
