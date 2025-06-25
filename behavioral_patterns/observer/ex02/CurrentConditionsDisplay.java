package behavioral_patterns.observer.ex02;

/**
 * CurrentConditionsDisplay 클래스는 현재 기상 상태를 출력하는 Observer입니다.
 */
class CurrentConditionsDisplay implements WeatherObserver {
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current: " + temp + "F, " + humidity + "% humidity");
    }
}
