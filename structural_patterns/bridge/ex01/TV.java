package structural_patterns.bridge.ex01;

// TV 클래스는 Device 인터페이스를 구현한 TV 기기입니다.
public class TV implements Device {
    // TV의 전원 상태를 저장하는 변수입니다.
    private boolean on = false;
    // TV의 볼륨을 저장하는 변수입니다.
    private int volume = 30;

    // TV를 켜는 메소드입니다.
    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV is now ON.");
    }

    // TV를 끄는 메소드입니다.
    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV is now OFF.");
    }

    // TV의 볼륨을 설정하는 메소드입니다.
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume);
    }

    // TV가 켜져 있는지 확인하는 메소드입니다.
    @Override
    public boolean isEnabled() {
        return on;
    }
}
