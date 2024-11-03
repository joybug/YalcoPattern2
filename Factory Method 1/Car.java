/**
 * Car(자동차) 클래스
 * - Vehicle 인터페이스를 구현한 구체적인 차량 클래스
 * - 팩토리 메서드 패턴에서 '구체적 제품(Concrete Product)'의 역할을 합니다
 */
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");  // 자동차 운전 동작 구현
    }
}