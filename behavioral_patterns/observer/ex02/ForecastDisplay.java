package behavioral_patterns.observer.ex02;

/**
 * ForecastDisplay 클래스는 기상 예보를 출력하는 Observer입니다.
 * 기압에 따라 예보를 출력합니다.
 */
class ForecastDisplay implements WeatherObserver {
    /**
     * 기상 데이터 변경 시 예보 정보를 출력합니다.
     * @param temp 온도
     * @param humidity 습도
     * @param pressure 기압
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        // 기압에 따라 예보 출력
        System.out.println("Forecast: " + (pressure < 29.92 ? "Rain" : "Sunny"));
    }
}
