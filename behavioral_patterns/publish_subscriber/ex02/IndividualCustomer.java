package behavioral_patterns.publish_subscriber.ex02;

/**
 * IndividualCustomer 클래스는 Customer 인터페이스의 구현체로,
 * 이메일을 비동기로 수신합니다.
 */
class IndividualCustomer implements Customer {
    /**
     * 고객 이름입니다.
     */
    private String name;

    /**
     * IndividualCustomer 객체를 생성합니다.
     * @param name 고객 이름
     */
    public IndividualCustomer(String name) {
        this.name = name;
    }

    /**
     * 이메일을 비동기로 수신하고, 읽는 과정을 시뮬레이션합니다.
     * @param message 전달받은 이메일 메시지
     */
    @Override
    public void receiveEmail(String message) {
        // 이메일 수신 로그 출력
        System.out.println(name + " is receiving email async: " + message);
        try {
            Thread.sleep(5000);  // 이메일 읽는 시간 시뮬레이션
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(name + " finished reading email: " + message);
    }
}
