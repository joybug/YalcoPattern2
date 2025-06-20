package structural_patterns.bridge.ex02;

public class EncryptedMessage extends Message {
    public EncryptedMessage(MessageSender messageSender) {
        super(messageSender);
    }
    @Override
    public void send(String message) {
        String encryptedMessage = encrypt(message);
        messageSender.sendMessage(
            "Encrypted Message: " + encryptedMessage);
    }

    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}
