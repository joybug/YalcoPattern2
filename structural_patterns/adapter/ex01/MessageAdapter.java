package structural_patterns.adapter.ex01;

// MessageAdapter 클래스는 OldMessageSender를 ModernMessageSender로 변환해주는 어댑터입니다.
public class MessageAdapter implements ModernMessageSender {
    // 예전 메시지 시스템 객체를 참조합니다.
    private OldMessageSender oldSystem;

    // 생성자: 예전 메시지 시스템 객체를 받아 저장합니다.
    public MessageAdapter(OldMessageSender oldSystem) {
        this.oldSystem = oldSystem;
    }

    // ModernMessageSender 인터페이스의 sendMessage 메소드 구현
    // 메시지와 수신자를 받아 예전 시스템 형식으로 변환하여 전송합니다.
    @Override
    public void sendMessage(String message, String recipient) {
        // 메시지와 수신자를 배열로 만듭니다.
        String[] messageData = {message, recipient};
        // 예전 시스템의 send 메소드를 호출합니다.
        int result = oldSystem.send(messageData);
        // 전송 결과가 1이 아니면 실패 메시지를 출력합니다.
        if (result != 1) {
            System.out.println("Failed to send message");
        }
    }
}
