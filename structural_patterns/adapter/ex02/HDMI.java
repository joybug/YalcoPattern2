package structural_patterns.adapter.ex02;

// HDMI 클래스는 HDMI 케이블을 사용하는 디스플레이 장치(Adaptee)입니다.
public class HDMI {
    // HDMI 케이블로 연결하여 화면을 출력하는 메소드입니다.
    void connectWithHdmiCable(int resolution) {
        // 해상도와 함께 HDMI로 출력한다는 메시지를 출력합니다.
        System.out.println(
            "Displaying via HDMI with resolution: " + resolution + "p"
        );
    }
}
