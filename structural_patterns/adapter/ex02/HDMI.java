package structural_patterns.adapter.ex02;

// Adaptee
public class HDMI {
    void connectWithHdmiCable(int resolution) {
        System.out.println(
            "Displaying via HDMI with resolution: " + resolution + "p"
        );
    }
}
