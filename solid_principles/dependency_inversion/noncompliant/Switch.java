package solid_principles.dependency_inversion.noncompliant;

/**
 * Switch 클래스 (비준수 예시)
 * DIP(의존성 역전 원칙)을 지키지 않은 고수준 모듈입니다.
 * Fan(구현 클래스)에 직접 의존하므로, 확장성/유연성이 떨어집니다.
 * 
 * - 생성자: Fan 객체를 직접 받아 저장합니다.
 * - turnOn(): Fan의 spin()을 호출해 선풍기를 켭니다.
 * - turnOff(): Fan의 stop()을 호출해 선풍기를 끕니다.
 */
public class Switch {
    /**
     * Fan 객체(구현 클래스에 직접 의존)
     */
    private Fan fan;

    /**
     * 생성자
     * @param fan 제어할 Fan 객체
     */
    public Switch(Fan fan) {
        // 생성자에서 Fan 객체를 받아 저장
        this.fan = fan;
    }

    /**
     * 선풍기를 켜는 메서드
     */
    public void turnOn() {
        // Fan 객체의 spin()을 직접 호출
        fan.spin();
    }

    /**
     * 선풍기를 끄는 메서드
     */
    public void turnOff() {
        // Fan 객체의 stop()을 직접 호출
        fan.stop();
    }
}
