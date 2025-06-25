package behavioral_patterns.publish_subscriber.ex01;

/**
 * Subscriber 인터페이스는 메시지 수신 기능을 정의합니다.
 */
interface Subscriber {
    void update(Message message);
}
