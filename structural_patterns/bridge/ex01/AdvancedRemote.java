package structural_patterns.bridge.ex01;

// AdvancedRemote 클래스는 추가 기능(음소거 등)을 제공하는 리모컨입니다.
public class AdvancedRemote extends Remote {
    // 생성자: 제어할 Device 객체를 받아 부모 생성자에 전달합니다.
    public AdvancedRemote(Device device) {
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

    // 기기를 음소거하는 메소드입니다.
    public void mute() {
        device.setVolume(0);
        System.out.println("Device is muted.");
    }
}
