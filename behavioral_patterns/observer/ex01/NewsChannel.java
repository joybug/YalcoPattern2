package behavioral_patterns.observer.ex01;

/**
 * NewsChannel 클래스는 Concrete Observer(구독자) 역할을 하며,
 * 뉴스 알림을 받아 출력합니다.
 */
class NewsChannel implements Observer {
    /**
     * 채널 이름입니다.
     */
    private String name;

    /**
     * NewsChannel 객체를 생성합니다.
     * @param name 채널 이름
     */
    public NewsChannel(String name) {
        this.name = name;
    }

    /**
     * 발행자로부터 뉴스 알림을 받아 출력합니다.
     * @param news 전달받은 뉴스
     */
    @Override
    public void update(String news) {
        // 뉴스 수신 로그 출력
        System.out.println(name + " received news: " + news);
    }
}
