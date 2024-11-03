package factory_method1;
/**
 * MotorcycleFactory(오토바이 공장) 클래스
 * - VehicleFactory를 상속받아 실제로 Motorcycle 객체를 생성하는 구체적인 공장 클래스
 * - 팩토리 메서드 패턴에서 또 다른 '구체적 생산자(Concrete Creator)'입니다
 * - 부모 클래스의 추상 메서드 createVehicle()을 구현하여 실제 Motorcycle 인스턴스를 생성
 */
class MotorcycleFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Motorcycle();  // Motorcycle 객체를 생성하여 반환
    }
}