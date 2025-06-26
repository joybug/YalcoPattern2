package behavioral_patterns.observer.ex01;

/**
 * Main 클래스는 Observer 패턴을 이용한 뉴스 구독 예제를 실행합니다.
 * 뉴스 발행, 구독, 구독 해지 과정을 보여줍니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 뉴스 발행자(Subject) 객체 생성
        NewsAgency agency = new NewsAgency();

        // 구독자(Observer) 객체 생성
        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        // 구독자 등록
        agency.registerObserver(channel1);
        agency.registerObserver(channel2);

        // 뉴스 발행(모든 구독자에게 알림)
        agency.setNews("Breaking news: Observer Pattern in action!");

        // 구독 해지
        agency.removeObserver(channel2);

        // 뉴스 발행(남은 구독자에게만 알림)
        agency.setNews("Another update: Channel 2 unsubscribed.");
    }
}
