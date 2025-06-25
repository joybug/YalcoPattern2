package behavioral_patterns.observer.ex02;

/**
 * StatisticsDisplay 클래스는 통계 정보를 출력하는 Observer입니다.
 */
class StatisticsDisplay implements WeatherObserver {
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Avg/Max/Min temp: " + temp + "/" + (temp + 2) + "/" + (temp - 2));
    }
}
