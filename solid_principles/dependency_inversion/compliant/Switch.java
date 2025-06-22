package solid_principles.dependency_inversion.compliant;

/**
 * Switch 클래스
 * DIP(의존성 역전 원칙)을 준수하는 고수준 모듈로,
 * Switchable 인터페이스를 구현한 장치(예: Fan 등)를 제어합니다.
 * 
 * - 생성자: 제어할 장치(Switchable)를 주입받아 저장합니다.
 * - turnOn(): 장치를 켭니다.
 * - turnOff(): 장치를 끕니다.
 */
public class Switch {
    /**
     * 제어할 장치(인터페이스 타입으로 선언)
     */
    private Switchable device;

    /**
     * 생성자
     * @param device 제어할 Switchable 장치(예: Fan)
     */
    public Switch(Switchable device) {
        // 생성자에서 장치 객체를 받아서 저장
        this.device = device;
    }

    /**
     * 장치를 켜는 메서드
     */
    public void turnOn() {
        // 실제 동작은 device(장치) 객체의 turnOn()에 위임
        device.turnOn();
    }

    /**
     * 장치를 끄는 메서드
     */
    public void turnOff() {
        // 실제 동작은 device(장치) 객체의 turnOff()에 위임
        device.turnOff();
    }
}
