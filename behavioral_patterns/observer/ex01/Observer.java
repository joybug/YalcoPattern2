package behavioral_patterns.observer.ex01;

/**
 * Observer(구독자) 인터페이스는 알림을 받는 메서드를 정의합니다.
 */
interface Observer {
    void update(String news);
}
