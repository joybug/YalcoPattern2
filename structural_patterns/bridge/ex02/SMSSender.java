package structural_patterns.bridge.ex02;

// SMSSender 클래스는 SMS로 메시지를 전송하는 구현체입니다.
public class SMSSender implements MessageSender {
    // 메시지를 SMS로 전송하는 메소드입니다.
    @Override
    public void sendMessage(String message) {
        // SMS로 메시지를 전송한다는 메시지를 출력합니다.
        System.out.println("Sending SMS with message: " + message);
    }
}
