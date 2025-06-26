package behavioral_patterns.mediator.ex01;

/**
 * UserImpl 클래스는 User 추상 클래스의 구체 구현체입니다.
 * send와 receive 메서드를 실제로 구현합니다.
 */
public class UserImpl extends User {
    /**
     * UserImpl 객체를 생성합니다.
     * @param mediator 중재자 객체
     * @param name 사용자 이름
     */
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    /**
     * 메시지를 전송합니다.
     * @param message 보낼 메시지
     */
    @Override
    public void send(String message) {
        // 메시지 전송 로그 출력
        System.out.println(this.name + ": Sending Message = " + message);
        // 중재자를 통해 메시지 전달
        mediator.sendMessage(message, this);
    }

    /**
     * 메시지를 수신합니다.
     * @param message 받은 메시지
     */
    @Override
    public void receive(String message) {
        // 메시지 수신 로그 출력
        System.out.println(this.name + ": Received Message = " + message);
    }
}
