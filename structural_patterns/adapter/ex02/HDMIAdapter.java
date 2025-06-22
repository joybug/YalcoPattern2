package structural_patterns.adapter.ex02;

// HDMIAdapter 클래스는 HDMI 장치를 DisplayAdapter 인터페이스에 맞게 변환하는 어댑터입니다.
public class HDMIAdapter implements DisplayAdapter {
    // HDMI 장치 객체를 참조합니다.
    private HDMI hdmi;
    // 출력 해상도를 저장하는 변수입니다.
    private int resolution;
    // 생성자: HDMI 객체와 해상도를 받아 저장합니다.
    public HDMIAdapter(HDMI hdmi, int resolution) {
        this.hdmi = hdmi;
        this.resolution = resolution;
    }

    // DisplayAdapter 인터페이스의 display 메소드 구현
    // HDMI 장치의 출력 메소드를 호출합니다.
    @Override
    public void display() {
        hdmi.connectWithHdmiCable(resolution);
    }
}
