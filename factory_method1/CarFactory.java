package factory_method1;
/**
 * CarFactory(자동차 공장) 클래스
 * - VehicleFactory를 상속받아 실제로 Car 객체를 생성하는 구체적인 공장 클래스
 * - 팩토리 메서드 패턴에서 '구체적 생산자(Concrete Creator)'의 역할을 합니다
 * - 부모 클래스의 추상 메서드 createVehicle()을 구현하여 실제 Car 인스턴스를 생성
 */
class CarFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();  // Car 객체를 생성하여 반환
    }
}