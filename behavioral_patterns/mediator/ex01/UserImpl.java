package behavioral_patterns.mediator.ex01;

/**
 * UserImpl 클래스는 User 추상 클래스의 구체 구현체입니다.
 * send와 receive 메서드를 실제로 구현합니다.
 */
public class UserImpl extends User {

    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + ": Sending Message = " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": Received Message = " + message);
    }
}
