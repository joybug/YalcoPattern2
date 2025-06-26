package behavioral_patterns.publish_subscriber.ex01;

/**
 * NewsSubscriber 클래스는 Subscriber 인터페이스의 구현체로,
 * 메시지를 수신하면 콘솔에 출력합니다.
 */
class NewsSubscriber implements Subscriber {
    /**
     * 구독자 이름입니다.
     */
    private String name;

    /**
     * NewsSubscriber 객체를 생성합니다.
     * @param name 구독자 이름
     */
    public NewsSubscriber(String name) {
        this.name = name;
    }

    /**
     * 메시지를 수신하면 콘솔에 출력합니다.
     * @param message 전달받은 메시지
     */
    @Override
    public void update(Message message) {
        // 메시지 수신 로그 출력
        System.out.println(name + " received: " + message.getContent() + " on topic: " + message.getTopic());
    }
}
