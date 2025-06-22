package structural_patterns.bridge.ex01;

// Radio 클래스는 Device 인터페이스를 구현한 라디오 기기입니다.
public class Radio implements Device {
    // 라디오의 전원 상태를 저장하는 변수입니다.
    private boolean on = false;
    // 라디오의 볼륨을 저장하는 변수입니다.
    private int volume = 30;

    // 라디오를 켜는 메소드입니다.
    @Override
    public void turnOn() {
        on = true;
        System.out.println("Radio is now ON.");
    }

    // 라디오를 끄는 메소드입니다.
    @Override
    public void turnOff() {
        on = false;
        System.out.println("Radio is now OFF.");
    }

    // 라디오의 볼륨을 설정하는 메소드입니다.
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + volume);
    }

    // 라디오가 켜져 있는지 확인하는 메소드입니다.
    @Override
    public boolean isEnabled() {
        return on;
    }
}
