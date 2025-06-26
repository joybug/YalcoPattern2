package behavioral_patterns.observer.ex01;

/**
 * Observer(구독자) 인터페이스는 알림을 받는 메서드를 정의합니다.
 * 구독자는 update 메서드를 통해 발행자의 변경 사항을 전달받습니다.
 */
interface Observer {
    /**
     * 발행자로부터 알림을 받는 메서드입니다.
     * @param news 전달받은 뉴스(메시지)
     */
    void update(String news);
}
