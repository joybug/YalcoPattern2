package behavioral_patterns.mediator.ex01;

/**
 * Main 클래스는 Mediator 패턴을 이용한 채팅방 예제를 실행합니다.
 * 여러 사용자가 중재자를 통해 메시지를 주고받는 모습을 보여줍니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 중재자(채팅방) 객체 생성
        ChatMediator mediator = new ChatMediatorImpl();

        // 사용자 객체 생성
        User user1 = new UserImpl(mediator, "John");
        User user2 = new UserImpl(mediator, "Jane");
        User user3 = new UserImpl(mediator, "Bob");
        User user4 = new UserImpl(mediator, "Alice");

        // 채팅방에 사용자 추가
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        // John이 메시지를 전송(다른 모든 사용자에게 전달됨)
        user1.send("Hi All");
    }
}
