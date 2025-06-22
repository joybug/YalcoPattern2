package structural_patterns.adapter.ex01;

// ModernMessageSender 인터페이스는 최신 메시지 전송 시스템의 표준 인터페이스입니다.
// sendMessage()는 메시지와 수신자를 받아 메시지를 전송합니다.
public interface ModernMessageSender {
    // 메시지와 수신자를 받아 메시지를 전송하는 메소드입니다.
    void sendMessage(String message, String recipient);
}
