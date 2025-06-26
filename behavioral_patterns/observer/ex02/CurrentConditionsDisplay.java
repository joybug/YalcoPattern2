package behavioral_patterns.observer.ex02;

/**
 * CurrentConditionsDisplay 클래스는 현재 기상 상태를 출력하는 Observer입니다.
 * 온도와 습도를 출력합니다.
 */
class CurrentConditionsDisplay implements WeatherObserver {
    /**
     * 기상 데이터 변경 시 현재 상태를 출력합니다.
     * @param temp 온도
     * @param humidity 습도
     * @param pressure 기압
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        // 현재 온도와 습도 출력
        System.out.println("Current: " + temp + "F, " + humidity + "% humidity");
    }
}
