package behavioral_patterns.publish_subscriber.ex02;

/**
 * Customer 인터페이스는 이메일 수신 기능을 정의합니다.
 * receiveEmail 메서드를 통해 이메일을 전달받습니다.
 */
interface Customer {
    /**
     * 이메일을 전달받는 메서드입니다.
     * @param message 전달받은 이메일 메시지
     */
    void receiveEmail(String message);
}
