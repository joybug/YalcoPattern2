package behavioral_patterns.command.ex01;

/**
 * 전등(Light) 클래스
 * 실제 동작을 수행하는 수신자(Receiver) 역할입니다.
 *
 * <p>명령 객체(Command)가 이 객체의 메서드를 호출하여 동작을 수행합니다.</p>
 */
public class Light {
    /**
     * 전등을 켜는 메서드입니다.
     * 호출되면 "Light is ON"을 출력합니다.
     */
    public void turnOn() {
        // 실제로 전등을 켜는 동작(여기서는 출력문)
        System.out.println("Light is ON");
    }

    /**
     * 전등을 끄는 메서드입니다.
     * 호출되면 "Light is OFF"을 출력합니다.
     */
    public void turnOff() {
        // 실제로 전등을 끄는 동작(여기서는 출력문)
        System.out.println("Light is OFF");
    }
}
