package behavioral_patterns.publish_subscriber.ex02;

/**
 * Main 클래스는 비동기 이메일 발송 Publish-Subscribe 예제를 실행합니다.
 */
public class Main {
    public static void main(String[] args) {
        EmailDeliveryService emailService = new EmailDeliveryService();

        MarketingDepartment marketing = new MarketingDepartment(emailService, "ProductLaunch");

        Customer customer1 = new IndividualCustomer("Customer 1");
        Customer customer2 = new IndividualCustomer("Customer 2");

        emailService.subscribe("ProductLaunch", customer1);
        emailService.subscribe("ProductLaunch", customer2);

        marketing.launchCampaign("New Product");

        Customer customer3 = new IndividualCustomer("Customer 3");
        emailService.subscribe("ProductLaunch", customer3);

        marketing.launchCampaign("Update");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        emailService.shutdown();
    }
}
