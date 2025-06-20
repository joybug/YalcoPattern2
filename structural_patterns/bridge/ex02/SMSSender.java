package structural_patterns.bridge.ex02;

public class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}
