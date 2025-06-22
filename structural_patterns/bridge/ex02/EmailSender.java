package structural_patterns.bridge.ex02;

// EmailSender 클래스는 이메일로 메시지를 전송하는 구현체입니다.
public class EmailSender implements MessageSender {
    // 메시지를 이메일로 전송하는 메소드입니다.
    @Override
    public void sendMessage(String message) {
        // 이메일로 메시지를 전송한다는 메시지를 출력합니다.
        System.out.println("Sending email with message: " + message);
    }
}
