package behavioral_patterns.publish_subscriber.ex01;

/**
 * Subscriber 인터페이스는 메시지 수신 기능을 정의합니다.
 * 구독자는 update 메서드를 통해 발행된 메시지를 전달받습니다.
 */
interface Subscriber {
    /**
     * 발행자로부터 메시지를 전달받는 메서드입니다.
     * @param message 전달받은 메시지
     */
    void update(Message message);
}
