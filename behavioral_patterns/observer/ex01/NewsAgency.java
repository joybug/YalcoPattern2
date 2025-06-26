package behavioral_patterns.observer.ex01;

import java.util.ArrayList;
import java.util.List;

/**
 * NewsAgency 클래스는 Concrete Subject(발행자) 역할을 하며,
 * 구독자(Observer) 관리 및 뉴스 알림 기능을 구현합니다.
 */
class NewsAgency implements Subject {
    /**
     * 등록된 구독자 목록입니다.
     */
    private List<Observer> observers = new ArrayList<>();
    /**
     * 현재 뉴스 내용입니다.
     */
    private String news;

    /**
     * 구독자를 등록합니다.
     * @param observer 등록할 구독자
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 구독자를 해지합니다.
     * @param observer 해지할 구독자
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 모든 구독자에게 현재 뉴스를 알립니다.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news); // 각 구독자에게 뉴스 전달
        }
    }

    /**
     * 새로운 뉴스를 설정하고, 구독자에게 알립니다.
     * @param news 새로운 뉴스
     */
    public void setNews(String news) {
        this.news = news;
        notifyObservers(); // 뉴스 변경 시 알림
    }
}
