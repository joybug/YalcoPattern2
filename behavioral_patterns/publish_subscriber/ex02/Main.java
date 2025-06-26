package behavioral_patterns.publish_subscriber.ex02;

/**
 * Main 클래스는 비동기 이메일 발송 Publish-Subscribe 예제를 실행합니다.
 * 구독, 발행, 비동기 메시지 전달 과정을 보여줍니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 이메일 발송 서비스 객체 생성
        EmailDeliveryService emailService = new EmailDeliveryService();

        // 마케팅 부서(발행자) 객체 생성
        MarketingDepartment marketing = new MarketingDepartment(emailService, "ProductLaunch");

        // 고객(구독자) 객체 생성 및 구독 등록
        Customer customer1 = new IndividualCustomer("Customer 1");
        Customer customer2 = new IndividualCustomer("Customer 2");
        emailService.subscribe("ProductLaunch", customer1);
        emailService.subscribe("ProductLaunch", customer2);

        // 캠페인 발송(모든 구독자에게 이메일 발송)
        marketing.launchCampaign("New Product");

        // 새로운 구독자 추가 후 다시 캠페인 발송
        Customer customer3 = new IndividualCustomer("Customer 3");
        emailService.subscribe("ProductLaunch", customer3);
        marketing.launchCampaign("Update");

        // 비동기 작업 대기(예시)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // ExecutorService 종료
        emailService.shutdown();
    }
}
