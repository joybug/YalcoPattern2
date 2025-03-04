package factory_method.ex01;
/**
 * Vehicle(차량) 인터페이스
 * - 모든 차량 타입(자동차, 오토바이 등)이 구현해야 하는 기본 인터페이스
 * - 팩토리 메서드 패턴에서 '제품(Product)'의 역할을 합니다
 */
interface Vehicle {
    // 모든 차량은 운전/주행이 가능해야 함
    void drive();
}