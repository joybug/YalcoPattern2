package structural_patterns.bridge.ex02;

// EncryptedMessage 클래스는 암호화된 메시지를 전송하는 메시지 종류입니다.
public class EncryptedMessage extends Message {
    // 생성자: 메시지 전송 방식을 받아 부모 생성자에 전달합니다.
    public EncryptedMessage(MessageSender messageSender) {
        super(messageSender);
    }
    // 메시지를 암호화하여 전송하는 메소드입니다.
    @Override
    public void send(String message) {
        // 메시지를 암호화합니다(여기서는 문자열을 뒤집음).
        String encryptedMessage = encrypt(message);
        // "Encrypted Message: " 접두어를 붙여 전송합니다.
        messageSender.sendMessage(
            "Encrypted Message: " + encryptedMessage);
    }

    // 메시지를 암호화하는 private 메소드입니다.
    private String encrypt(String message) {
        // 실제 암호화 대신 문자열을 뒤집어 반환합니다.
        return new StringBuilder(message).reverse().toString();
    }
}
