package behavioral_patterns.observer.ex01;

/**
 * Subject(발행자) 인터페이스는 Observer(구독자) 관리 및 알림 기능을 정의합니다.
 * 구독자 등록, 해지, 알림 메서드를 제공합니다.
 */
interface Subject {
    /**
     * 구독자를 등록합니다.
     * @param observer 등록할 구독자
     */
    void registerObserver(Observer observer);

    /**
     * 구독자를 해지합니다.
     * @param observer 해지할 구독자
     */
    void removeObserver(Observer observer);

    /**
     * 모든 구독자에게 알림을 보냅니다.
     */
    void notifyObservers();
}
