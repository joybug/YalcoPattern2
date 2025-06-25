package behavioral_patterns.publish_subscriber.ex01;

/**
 * Publisher 인터페이스는 메시지 발행 기능을 정의합니다.
 */
interface Publisher {
    void publish(Message message);
}
