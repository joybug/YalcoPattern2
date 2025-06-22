package structural_patterns.adapter.ex02;

// USBAdapter 클래스는 USB 장치를 DisplayAdapter 인터페이스에 맞게 변환하는 어댑터입니다.
public class USBAdapter implements DisplayAdapter {
    // USB 장치 객체를 참조합니다.
    private USB usb;
    // 출력할 데이터(문자열)를 저장하는 변수입니다.
    private String data;
    // 생성자: USB 객체와 데이터를 받아 저장합니다.
    public USBAdapter(USB usb, String data) {
        this.usb = usb;
        this.data = data;
    }

    // DisplayAdapter 인터페이스의 display 메소드 구현
    // USB 장치의 출력 메소드를 호출합니다.
    @Override
    public void display() {
        usb.connectWithUsbCable(data);
    }
}
