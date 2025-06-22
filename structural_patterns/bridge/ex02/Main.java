package structural_patterns.bridge.ex02;

// Main 클래스는 브리지 패턴을 이용한 다양한 메시지 전송 조합을 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 이메일과 SMS 전송 방식을 준비합니다.
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();

        // 일반 텍스트 메시지를 이메일로 전송합니다.
        Message textMessage = new TextMessage(emailSender);
        textMessage.send("Hello World!");

        // 암호화된 메시지를 SMS로 전송합니다.
        Message encryptedMessage = new EncryptedMessage(smsSender);
        encryptedMessage.send("Hello World!");
    }
}
