package factory_method.ex01;
/**
 * VehicleFactory(차량 공장) 추상 클래스
 * - 팩토리 메서드 패턴의 핵심인 '생산자(Creator)' 역할을 하는 추상 클래스
 * - 차량을 생성하고 배달하는 전체적인 프로세스를 정의
 * - 실제 차량 생성은 하위 클래스에서 구현하도록 위임(팩토리 메서드 패턴의 핵심)
 */
abstract class VehicleFactory {
    /**
     * 팩토리 메서드 - 실제 차량 객체 생성을 담당
     * 서브클래스에서 이 메서드를 구현하여 구체적인 차량 객체 생성
     */
    abstract Vehicle createVehicle();
    
    /**
     * 템플릿 메서드 - 차량 배달 프로세스 정의
     * 1. 차량 생성
     * 2. 배달 메시지 출력
     * 3. 시험 운전 실행
     */
    public void deliverVehicle() {
        // 1. 팩토리 메서드를 통해 구체적인 차량 객체 생성
        Vehicle vehicle = createVehicle();
        
        // 2. 배달 메시지 출력
        System.out.println("Delivering the vehicle:");
        
        // 3. 차량 테스트 드라이브 실행
        vehicle.drive();
    }
}