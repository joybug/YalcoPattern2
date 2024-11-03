/**
 * VehicleFactory(차량 공장) 추상 클래스
 * - 팩토리 메서드 패턴의 핵심인 '생산자(Creator)' 역할을 하는 추상 클래스
 * - 차량을 생성하고 배달하는 전체적인 프로세스를 정의
 * - 실제 차량 생성은 하위 클래스에서 구현하도록 위임(팩토리 메서드 패턴의 핵심)
 */
abstract class VehicleFactory {
    /**
     * 팩토리 메서드 - 실제 Vehicle 객체를 생성하는 추상 메서드
     * - 하위 클래스(CarFactory, MotorcycleFactory)에서 반드시 구현해야 함
     * - protected로 선언되어 있어 외부에서 직접 호출할 수 없음
     * @return 생성된 Vehicle 객체
     */
    abstract Vehicle createVehicle();
    
    /**
     * 차량 배달 프로세스를 구현한 메서드
     * - 팩토리 메서드를 활용하여 차량을 생성하고 배달하는 전체 프로세스 관리
     * - 템플릿 메서드 패턴이 적용된 부분으로, 프로세스의 뼈대를 제공
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