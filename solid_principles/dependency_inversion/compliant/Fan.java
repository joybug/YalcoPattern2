package solid_principles.dependency_inversion.compliant;

/**
 * Fan 클래스
 * Switchable 인터페이스를 구현한 저수준 모듈(구현 클래스)입니다.
 * 실제로 동작하는 선풍기 역할을 하며, Switch에서 제어할 수 있습니다.
 * 
 * - turnOn(): 선풍기를 켭니다.
 * - turnOff(): 선풍기를 끕니다.
 */
public class Fan implements Switchable {
    /**
     * 선풍기를 켜는 메서드
     * @Override: Switchable 인터페이스의 메서드를 구현
     */
    @Override
    public void turnOn() {
        // 실제로 선풍기가 켜졌음을 출력
        System.out.println("Fan is spinning");
    }

    /**
     * 선풍기를 끄는 메서드
     * @Override: Switchable 인터페이스의 메서드를 구현
     */
    @Override
    public void turnOff() {
        // 실제로 선풍기가 꺼졌음을 출력
        System.out.println("Fan is stopping");
    }
}
