package behavioral_patterns.observer.ex02;

/**
 * WeatherStation(주제) 인터페이스는 Observer(관찰자) 관리 및 알림 기능을 정의합니다.
 * 관찰자 등록, 해지, 알림 메서드를 제공합니다.
 */
interface WeatherStation {
    /**
     * 관찰자를 등록합니다.
     * @param o 등록할 관찰자
     */
    void registerObserver(WeatherObserver o);

    /**
     * 관찰자를 해지합니다.
     * @param o 해지할 관찰자
     */
    void removeObserver(WeatherObserver o);

    /**
     * 모든 관찰자에게 알림을 보냅니다.
     */
    void notifyObservers();
}
