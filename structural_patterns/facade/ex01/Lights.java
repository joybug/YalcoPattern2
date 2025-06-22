package structural_patterns.facade.ex01;

// Lights 클래스는 조명 장치를 나타냅니다.
public class Lights {
    // 조명을 켜는 메소드입니다.
    public void on() {
        System.out.println("Lights are on.");
    }

    // 조명을 끄는 메소드입니다.
    public void off() {
        System.out.println("Lights are off.");
    }
}
