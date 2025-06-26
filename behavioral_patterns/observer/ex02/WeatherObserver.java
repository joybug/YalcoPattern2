package behavioral_patterns.observer.ex02;

/**
 * WeatherObserver(관찰자) 인터페이스는 기상 데이터 변경 시 알림을 받는 메서드를 정의합니다.
 * 관찰자는 update 메서드를 통해 주제의 변경 사항을 전달받습니다.
 */
interface WeatherObserver {
    /**
     * 주제로부터 기상 데이터 변경 알림을 받는 메서드입니다.
     * @param temp 온도
     * @param humidity 습도
     * @param pressure 기압
     */
    void update(float temp, float humidity, float pressure);
}
