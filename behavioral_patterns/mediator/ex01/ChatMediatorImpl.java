package behavioral_patterns.mediator.ex01;

import java.util.List;
import java.util.ArrayList;

/**
 * ChatMediatorImpl 클래스는 ChatMediator 인터페이스의 구체 구현체입니다.
 * 사용자 목록을 관리하며, 메시지를 중재하여 전달합니다.
 */
public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
