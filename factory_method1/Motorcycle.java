package factory_method1;
/**
 * Motorcycle(오토바이) 클래스
 * - Vehicle 인터페이스를 구현한 또 다른 구체적인 차량 클래스
 * - 팩토리 메서드 패턴에서 또 다른 '구체적 제품(Concrete Product)'입니다
 */
class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a motorcycle");  // 오토바이 주행 동작 구현
    }
}