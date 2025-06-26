package behavioral_patterns.publish_subscriber.ex01;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * Broker 클래스는 토픽별 구독자 관리 및 메시지 전달을 담당합니다.
 * 발행자와 구독자 사이에서 메시지를 중개합니다.
 */
class Broker {
    /**
     * 토픽별 구독자 목록을 저장하는 맵입니다.
     */
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    /**
     * 구독자를 토픽에 등록합니다.
     * @param topic 구독할 토픽
     * @param subscriber 구독자
     */
    public void subscribe(String topic, Subscriber subscriber) {
        subscribers.computeIfAbsent(topic, k -> new ArrayList<>()).add(subscriber);
    }

    /**
     * 메시지를 해당 토픽의 모든 구독자에게 전달합니다.
     * @param message 발행된 메시지
     */
    public void publish(Message message) {
        List<Subscriber> topicSubscribers = subscribers.get(message.getTopic());
        if (topicSubscribers != null) {
            for (Subscriber subscriber : topicSubscribers) {
                // 각 구독자에게 메시지 전달
                subscriber.update(message);
            }
        }
    }
}
