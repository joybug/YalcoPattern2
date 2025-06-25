package behavioral_patterns.publish_subscriber.ex01;

/**
 * NewsPublisher 클래스는 Publisher 인터페이스의 구현체로,
 * Broker를 통해 메시지를 발행합니다.
 */
class NewsPublisher implements Publisher {
    private Broker broker;

    public NewsPublisher(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void publish(Message message) {
        System.out.println("Publishing: " + message.getContent() + " on topic: " + message.getTopic());
        broker.publish(message);
    }
}
