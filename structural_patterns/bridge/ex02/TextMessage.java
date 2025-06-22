package structural_patterns.bridge.ex02;

// TextMessage 클래스는 일반 텍스트 메시지를 전송하는 메시지 종류입니다.
public class TextMessage extends Message {
    // 생성자: 메시지 전송 방식을 받아 부모 생성자에 전달합니다.
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }
    // 메시지를 전송하는 메소드입니다.
    @Override
    public void send(String message) {
        // "Text Message: " 접두어를 붙여 전송합니다.
        messageSender.sendMessage("Text Message: " + message);
    }
}
