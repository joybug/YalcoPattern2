package structural_patterns.bridge.ex02;

// MessageSender 인터페이스는 메시지 전송 방식(이메일, SMS 등)의 표준 인터페이스입니다.
public interface MessageSender {
    // 메시지를 전송하는 메소드입니다.
    void sendMessage(String message);
}
