package behavioral_patterns.observer.ex02;

/**
 * WeatherObserver(관찰자) 인터페이스는 기상 데이터 변경 시 알림을 받는 메서드를 정의합니다.
 */
interface WeatherObserver {
    void update(float temp, float humidity, float pressure);
}
