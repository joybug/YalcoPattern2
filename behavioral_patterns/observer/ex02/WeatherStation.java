package behavioral_patterns.observer.ex02;

/**
 * WeatherStation(주제) 인터페이스는 Observer 관리 및 알림 기능을 정의합니다.
 */
interface WeatherStation {
    void registerObserver(WeatherObserver o);
    void removeObserver(WeatherObserver o);
    void notifyObservers();
}
