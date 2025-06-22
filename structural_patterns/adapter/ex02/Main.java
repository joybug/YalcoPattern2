package structural_patterns.adapter.ex02;

import java.util.ArrayList;
import java.util.List;

// Main 클래스는 다양한 디스플레이 어댑터의 동작을 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 각 디스플레이 장치 객체를 생성합니다.
        USB usb = new USB();
        HDMI hdmi = new HDMI();
        VGA vga = new VGA();

        // DisplayAdapter 리스트에 각 어댑터를 추가합니다.
        List<DisplayAdapter> adapters = new ArrayList<>();
        adapters.add(new USBAdapter(usb, "Video Data"));
        adapters.add(new HDMIAdapter(hdmi, 1080));
        adapters.add(new VGAAdapter(vga, true));

        // 모든 어댑터의 display()를 호출하여 화면에 출력합니다.
        for (DisplayAdapter adapter : adapters) {
            adapter.display();
        }
    }
}
