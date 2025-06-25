package behavioral_patterns.observer.ex01;

import java.util.ArrayList;
import java.util.List;

/**
 * NewsAgency 클래스는 Concrete Subject(발행자) 역할을 하며,
 * 구독자(Observer) 관리 및 뉴스 알림 기능을 구현합니다.
 */
class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
