package factory_method.ex03;

/**
 * 결제 팩토리 추상 클래스
 * - 팩토리 메서드 패턴에서 '생산자(Creator)' 역할
 * - 다양한 결제 방식의 객체 생성을 추상화
 * 
 * 설계 목적:
 * 1. 결제 객체 생성 과정의 캡슐화
 * 2. 새로운 결제 방식 추가 시 확장성 제공
 * 3. 클라이언트 코드와 결제 구현의 분리
 * 
 * 활용 방법:
 * - 각각의 결제 방식별로 이 클래스를 상속받아 구체적인 팩토리 구현
 * - createPayment() 메서드를 오버라이드하여 해당 결제 방식의 객체 생성 로직 구현
 */
abstract class PaymentFactory {
    /**
     * 결제 객체를 생성하는 팩토리 메서드
     * - 실제 결제 객체 생성은 하위 클래스에서 구현
     * 
     * @param info 사용자의 금융 정보 (카드번호, 계좌번호 등)
     * @return 생성된 Payment 객체 
     */
    abstract Payment createPayment(FinancialInfo info);
}