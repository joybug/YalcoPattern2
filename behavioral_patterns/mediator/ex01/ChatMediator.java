package behavioral_patterns.mediator.ex01;

/**
 * ChatMediator 인터페이스는 채팅방 내에서 메시지 전달과 사용자 관리 기능을 정의합니다.
 */
public interface ChatMediator {
    /**
     * 메시지를 특정 사용자로부터 받아 다른 사용자들에게 전달합니다.
     * @param message 전달할 메시지
     * @param user 메시지를 보낸 사용자
     */
    void sendMessage(String message, User user);

    /**
     * 채팅방에 사용자를 추가합니다.
     * @param user 추가할 사용자
     */
    void addUser(User user);
}
