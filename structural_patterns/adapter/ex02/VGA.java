package structural_patterns.adapter.ex02;

// VGA 클래스는 VGA 케이블을 사용하는 디스플레이 장치(Adaptee)입니다.
public class VGA {
    // VGA 케이블로 연결하여 화면을 출력하는 메소드입니다.
    void connectWithVgaCable(boolean highQuality) {
        // 고화질 여부와 함께 VGA로 출력한다는 메시지를 출력합니다.
        System.out.println(
            "Displaying via VGA with high quality: " + highQuality
        );
    }
}
