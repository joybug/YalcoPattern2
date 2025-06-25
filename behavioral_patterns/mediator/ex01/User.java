package behavioral_patterns.mediator.ex01;

/**
 * User 추상 클래스는 채팅방 사용자의 기본 구조를 정의합니다.
 * 각 사용자는 mediator(중재자)와 이름을 가집니다.
 */
public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    /**
     * 메시지를 전송하는 추상 메서드
     * @param message 보낼 메시지
     */
    public abstract void send(String message);

    /**
     * 메시지를 수신하는 추상 메서드
     * @param message 받은 메시지
     */
    public abstract void receive(String message);
}
