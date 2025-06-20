package structural_patterns.bridge.ex02;

public abstract class Message {
    protected MessageSender messageSender;

    protected Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send(String message);
}
