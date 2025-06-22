package structural_patterns.adapter.ex02;

// USB 클래스는 USB 케이블을 사용하는 디스플레이 장치(Adaptee)입니다.
public class USB {
    // USB 케이블로 연결하여 화면을 출력하는 메소드입니다.
    void connectWithUsbCable(String data) {
        // 데이터와 함께 USB로 출력한다는 메시지를 출력합니다.
        System.out.println("Displaying via USB with data: " + data);
    }
}
