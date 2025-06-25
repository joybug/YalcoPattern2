package behavioral_patterns.observer.ex02;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherData 클래스는 Concrete Subject(주제) 역할을 하며,
 * 관찰자(Observer) 관리 및 기상 데이터 변경 시 알림 기능을 구현합니다.
 */
class WeatherData implements WeatherStation {
    private List<WeatherObserver> observers = new ArrayList<>();
    private float temperature, humidity, pressure;

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver o) {
        observers.add(o);
    }
    
    @Override
    public void removeObserver(WeatherObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }
}
