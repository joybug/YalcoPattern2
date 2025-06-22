package solid_principles.dependency_inversion.compliant;

/**
 * Switchable 인터페이스
 * DIP(의존성 역전 원칙)을 준수하기 위해 고수준 모듈이 저수준 모듈에 직접 의존하지 않도록
 * 스위치로 제어할 수 있는 모든 장치가 구현해야 하는 인터페이스입니다.
 * 
 * - turnOn(): 장치를 켜는 메서드
 * - turnOff(): 장치를 끄는 메서드
 */
public interface Switchable {
    /**
     * 장치를 켜는 메서드
     * 실제 동작은 구현 클래스에서 정의합니다.
     */
    void turnOn();

    /**
     * 장치를 끄는 메서드
     * 실제 동작은 구현 클래스에서 정의합니다.
     */
    void turnOff();
}
