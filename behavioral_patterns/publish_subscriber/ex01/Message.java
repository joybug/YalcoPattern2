package behavioral_patterns.publish_subscriber.ex01;

/**
 * Message 클래스는 발행되는 메시지의 내용과 주제를 저장합니다.
 */
class Message {
    private String content;
    private String topic;

    public Message(String content, String topic) {
        this.content = content;
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public String getTopic() {
        return topic;
    }
}
