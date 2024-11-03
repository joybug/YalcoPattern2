package factory_method1;
/**
 * 메인 클래스 - 클라이언트 코드
 * - 팩토리 메서드 패턴을 사용하는 실제 예제를 보여줍니다
 * - 각각의 공장을 사용해서 다른 종류의 차량을 생성하고 사용합니다
 */
public class Main {
    public static void main(String[] args) {
        // 자동차 공장을 사용하여 자동차 생성 및 테스트
        VehicleFactory carFactory = new CarFactory();
        carFactory.deliverVehicle();  // 자동차 생성 및 시험 주행
        
        // 오토바이 공장을 사용하여 오토바이 생성 및 테스트
        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.deliverVehicle();  // 오토바이 생성 및 시험 주행
    }
}