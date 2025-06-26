package behavioral_patterns.publish_subscriber.ex01;

/**
 * Message 클래스는 발행되는 메시지의 내용과 주제를 저장합니다.
 */
class Message {
    /**
     * 메시지 내용입니다.
     */
    private String content;
    /**
     * 메시지 주제(토픽)입니다.
     */
    private String topic;

    /**
     * Message 객체를 생성합니다.
     * @param content 메시지 내용
     * @param topic 메시지 주제
     */
    public Message(String content, String topic) {
        this.content = content;
        this.topic = topic;
    }

    /**
     * 메시지 내용을 반환합니다.
     * @return 메시지 내용
     */
    public String getContent() {
        return content;
    }

    /**
     * 메시지 주제를 반환합니다.
     * @return 메시지 주제
     */
    public String getTopic() {
        return topic;
    }
}
