package behavioral_patterns.publish_subscriber.ex01;

/**
 * NewsPublisher 클래스는 Publisher 인터페이스의 구현체로,
 * Broker를 통해 메시지를 발행합니다.
 */
class NewsPublisher implements Publisher {
    /**
     * 메시지 중개자(Broker) 객체입니다.
     */
    private Broker broker;

    /**
     * NewsPublisher 객체를 생성합니다.
     * @param broker 메시지 중개자
     */
    public NewsPublisher(Broker broker) {
        this.broker = broker;
    }

    /**
     * 메시지를 발행하고, Broker를 통해 구독자에게 전달합니다.
     * @param message 발행할 메시지
     */
    @Override
    public void publish(Message message) {
        // 발행 로그 출력
        System.out.println("Publishing: " + message.getContent() + " on topic: " + message.getTopic());
        broker.publish(message);
    }
}
