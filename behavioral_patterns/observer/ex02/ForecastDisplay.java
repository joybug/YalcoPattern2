package behavioral_patterns.observer.ex02;

/**
 * ForecastDisplay 클래스는 기상 예보를 출력하는 Observer입니다.
 */
class ForecastDisplay implements WeatherObserver {
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Forecast: " + (pressure < 29.92 ? "Rain" : "Sunny"));
    }
}
