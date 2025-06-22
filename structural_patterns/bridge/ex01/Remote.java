package structural_patterns.bridge.ex01;

// Remote 클래스는 Device를 제어하는 리모컨의 추상 클래스입니다.
public abstract class Remote {
    // 제어할 Device 객체를 참조합니다.
    protected Device device;

    // 생성자: 제어할 Device 객체를 받아 저장합니다.
    protected Remote(Device device) {
        this.device = device;
    }

    // 전원 on/off를 토글하는 추상 메소드입니다.
    public abstract void power();

    // 볼륨을 올리는 메소드입니다.
    public void volumeUp() {
        // 기기가 켜져 있으면 볼륨을 1로, 아니면 0으로 설정합니다.
        device.setVolume(device.isEnabled() ? 1 : 0);
    }

    // 볼륨을 내리는 메소드입니다.
    public void volumeDown() {
        // 기기가 켜져 있으면 볼륨을 -1로, 아니면 0으로 설정합니다.
        device.setVolume(device.isEnabled() ? -1 : 0);
    }
}
