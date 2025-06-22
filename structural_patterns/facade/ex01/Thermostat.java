package structural_patterns.facade.ex01;

// Thermostat 클래스는 온도 조절 장치를 나타냅니다.
public class Thermostat {
    // 온도를 설정하는 메소드입니다.
    public void setTemperature(int temperature) {
        // 설정된 온도를 출력합니다.
        System.out.println("Setting thermostat to " + temperature + " degrees.");
    }
}
