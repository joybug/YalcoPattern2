package behavioral_patterns.publish_subscriber.ex01;

/**
 * Main 클래스는 Publish-Subscribe 패턴을 이용한 뉴스 발행/구독 예제를 실행합니다.
 * 다양한 토픽에 대해 구독, 발행, 메시지 전달 과정을 보여줍니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 메시지 중개자(Broker) 객체 생성
        Broker broker = new Broker();

        // 뉴스 발행자 및 구독자 객체 생성
        NewsPublisher publisher = new NewsPublisher(broker);
        NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");

        // 구독자 등록(토픽별)
        broker.subscribe("sports", subscriber1);
        broker.subscribe("weather", subscriber2);
        broker.subscribe("sports", subscriber2);

        // 뉴스 발행(토픽별로 구독자에게 전달)
        publisher.publish(new Message("Liverpool won the match", "sports"));
        publisher.publish(new Message("It's sunny today", "weather"));
    }
}
