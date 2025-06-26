package behavioral_patterns.mediator.ex01;

import java.util.List;
import java.util.ArrayList;

/**
 * ChatMediatorImpl 클래스는 ChatMediator 인터페이스의 구체 구현체입니다.
 * 사용자 목록을 관리하며, 메시지를 중재하여 전달합니다.
 */
public class ChatMediatorImpl implements ChatMediator {
    /**
     * 채팅방에 참여한 사용자 목록입니다.
     */
    private List<User> users;

    /**
     * ChatMediatorImpl 객체를 생성합니다.
     * 사용자 목록을 초기화합니다.
     */
    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    /**
     * 채팅방에 사용자를 추가합니다.
     * @param user 추가할 사용자
     */
    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    /**
     * 메시지를 보낸 사용자를 제외한 모든 사용자에게 메시지를 전달합니다.
     * @param message 전달할 메시지
     * @param user 메시지를 보낸 사용자
     */
    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users) {
            // 메시지를 보낸 사용자를 제외하고 메시지 전달
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
