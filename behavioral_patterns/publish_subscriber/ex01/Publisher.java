package behavioral_patterns.publish_subscriber.ex01;

/**
 * Publisher 인터페이스는 메시지 발행 기능을 정의합니다.
 * 발행자는 publish 메서드를 통해 메시지를 전달합니다.
 */
interface Publisher {
    /**
     * 메시지를 발행하는 메서드입니다.
     * @param message 발행할 메시지
     */
    void publish(Message message);
}
