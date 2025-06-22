package structural_patterns.adapter.ex02;

// VGAAdapter 클래스는 VGA 장치를 DisplayAdapter 인터페이스에 맞게 변환하는 어댑터입니다.
public class VGAAdapter implements DisplayAdapter {
    // VGA 장치 객체를 참조합니다.
    private VGA vga;
    // 고화질 여부를 저장하는 변수입니다.
    private boolean highQuality;
    // 생성자: VGA 객체와 고화질 여부를 받아 저장합니다.
    public VGAAdapter(VGA vga, boolean highQuality) {
        this.vga = vga;
        this.highQuality = highQuality;
    }

    // DisplayAdapter 인터페이스의 display 메소드 구현
    // VGA 장치의 출력 메소드를 호출합니다.
    @Override
    public void display() {
        vga.connectWithVgaCable(highQuality);
    }
}
