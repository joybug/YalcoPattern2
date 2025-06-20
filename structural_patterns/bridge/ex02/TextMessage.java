package structural_patterns.bridge.ex02;

public class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }
    @Override
    public void send(String message) {
        messageSender.sendMessage("Text Message: " + message);
    }
}
