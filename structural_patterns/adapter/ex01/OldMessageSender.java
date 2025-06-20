package structural_patterns.adapter.ex01;

// Adaptee interface
public interface OldMessageSender {
    int send(String[] messageData);
}