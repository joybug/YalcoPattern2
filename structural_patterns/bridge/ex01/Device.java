package structural_patterns.bridge.ex01;

// Device 인터페이스는 TV, 라디오 등 다양한 기기의 공통 기능을 정의합니다.
public interface Device {
    // 기기를 켜는 메소드입니다.
    void turnOn();
    // 기기를 끄는 메소드입니다.
    void turnOff();
    // 볼륨을 설정하는 메소드입니다.
    void setVolume(int volume);
    // 기기가 켜져 있는지 확인하는 메소드입니다.
    boolean isEnabled();
}
