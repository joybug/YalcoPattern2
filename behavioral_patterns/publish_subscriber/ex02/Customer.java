package behavioral_patterns.publish_subscriber.ex02;

/**
 * Customer 인터페이스는 이메일 수신 기능을 정의합니다.
 */
interface Customer {
    void receiveEmail(String message);
}
