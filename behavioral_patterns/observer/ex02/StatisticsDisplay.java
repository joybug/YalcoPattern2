package behavioral_patterns.observer.ex02;

/**
 * StatisticsDisplay 클래스는 통계 정보를 출력하는 Observer입니다.
 * 평균/최고/최저 온도를 출력합니다.
 */
class StatisticsDisplay implements WeatherObserver {
    /**
     * 기상 데이터 변경 시 통계 정보를 출력합니다.
     * @param temp 온도
     * @param humidity 습도
     * @param pressure 기압
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        // 평균/최고/최저 온도(예시) 출력
        System.out.println("Avg/Max/Min temp: " + temp + "/" + (temp + 2) + "/" + (temp - 2));
    }
}
