package behavioral_patterns.observer.ex02;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherData 클래스는 Concrete Subject(주제) 역할을 하며,
 * 관찰자(Observer) 관리 및 기상 데이터 변경 시 알림 기능을 구현합니다.
 */
class WeatherData implements WeatherStation {
    /**
     * 등록된 관찰자 목록입니다.
     */
    private List<WeatherObserver> observers = new ArrayList<>();
    /**
     * 현재 온도, 습도, 기압 데이터입니다.
     */
    private float temperature, humidity, pressure;

    /**
     * 기상 데이터를 설정하고, 관찰자에게 알립니다.
     * @param temperature 온도
     * @param humidity 습도
     * @param pressure 기압
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers(); // 데이터 변경 시 알림
    }

    /**
     * 관찰자를 등록합니다.
     * @param o 등록할 관찰자
     */
    @Override
    public void registerObserver(WeatherObserver o) {
        observers.add(o);
    }

    /**
     * 관찰자를 해지합니다.
     * @param o 해지할 관찰자
     */
    @Override
    public void removeObserver(WeatherObserver o) {
        observers.remove(o);
    }

    /**
     * 모든 관찰자에게 현재 기상 데이터를 알립니다.
     */
    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure); // 각 관찰자에게 데이터 전달
        }
    }
}
