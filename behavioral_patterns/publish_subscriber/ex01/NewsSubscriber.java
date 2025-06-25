package behavioral_patterns.publish_subscriber.ex01;

/**
 * NewsSubscriber 클래스는 Subscriber 인터페이스의 구현체로,
 * 메시지를 수신하면 콘솔에 출력합니다.
 */
class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println(name + " received: " + message.getContent() + " on topic: " + message.getTopic());
    }
}
