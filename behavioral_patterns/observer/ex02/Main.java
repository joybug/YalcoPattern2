package behavioral_patterns.observer.ex02;

/**
 * Main 클래스는 Observer 패턴을 이용한 기상 관측 예제를 실행합니다.
 * 여러 디스플레이(Observer)가 기상 데이터 변경을 실시간으로 전달받는 모습을 보여줍니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 기상 데이터(주제) 객체 생성
        WeatherData weatherData = new WeatherData();

        // 디스플레이(관찰자) 객체 생성
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // 관찰자 등록
        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);

        // 기상 데이터 변경(모든 관찰자에게 알림)
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
