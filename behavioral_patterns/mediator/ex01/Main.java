package behavioral_patterns.mediator.ex01;

/**
 * Main 클래스는 Mediator 패턴을 이용한 채팅방 예제를 실행합니다.
 */
public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "John");
        User user2 = new UserImpl(mediator, "Jane");
        User user3 = new UserImpl(mediator, "Bob");
        User user4 = new UserImpl(mediator, "Alice");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
