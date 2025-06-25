package behavioral_patterns.publish_subscriber.ex02;

/**
 * IndividualCustomer 클래스는 Customer 인터페이스의 구현체로,
 * 이메일을 비동기로 수신합니다.
 */
class IndividualCustomer implements Customer {
    private String name;

    public IndividualCustomer(String name) {
        this.name = name;
    }

    @Override
    public void receiveEmail(String message) {
        System.out.println(name + " is receiving email async: " + message);
        try {
            Thread.sleep(5000);  // 이메일 읽는 시간 시뮬레이션
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(name + " finished reading email: " + message);
    }
}
