package behavioral_patterns.observer.ex01;

/**
 * Subject(발행자) 인터페이스는 Observer(구독자) 관리 및 알림 기능을 정의합니다.
 */
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
