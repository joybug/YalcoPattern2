package structural_patterns.bridge.ex01;

// BasicRemote 클래스는 기본적인 리모컨 기능을 제공하는 클래스입니다.
public class BasicRemote extends Remote {
    // 생성자: 제어할 Device 객체를 받아 부모 생성자에 전달합니다.
    public BasicRemote(Device device) {
        super(device);
    }

    // 전원 on/off를 토글하는 메소드입니다.
    @Override
    public void power() {
        // 기기가 켜져 있으면 끄고, 꺼져 있으면 켭니다.
        if (device.isEnabled()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }
}
