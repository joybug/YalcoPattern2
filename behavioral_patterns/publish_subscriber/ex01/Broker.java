package behavioral_patterns.publish_subscriber.ex01;

import java.util.*;

/**
 * Broker 클래스는 토픽별 구독자 관리 및 메시지 전달을 담당합니다.
 */
class Broker {
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void subscribe(String topic, Subscriber subscriber) {
        subscribers.computeIfAbsent(topic, k -> new ArrayList<>()).add(subscriber);
    }

    public void publish(Message message) {
        List<Subscriber> topicSubscribers = subscribers.get(message.getTopic());
        if (topicSubscribers != null) {
            for (Subscriber subscriber : topicSubscribers) {
                subscriber.update(message);
            }
        }
    }
}
