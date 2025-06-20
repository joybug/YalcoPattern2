package structural_patterns.bridge.ex01;

public interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    boolean isEnabled();
}
