package structural_patterns.bridge.ex02;

// Message 추상 클래스는 메시지의 종류(일반, 암호화 등)를 표현합니다.
// 실제 전송 방식은 MessageSender에 위임합니다.
public abstract class Message {
    // 메시지 전송 방식을 저장하는 변수입니다.
    protected MessageSender messageSender;

    // 생성자: 메시지 전송 방식을 받아 저장합니다.
    protected Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    // 메시지를 전송하는 추상 메소드입니다.
    public abstract void send(String message);
}
