package behavioral_patterns.publish_subscriber.ex02;

/**
 * MarketingDepartment 클래스는 Publisher 역할로,
 * 캠페인 메시지를 EmailDeliveryService를 통해 발송합니다.
 */
class MarketingDepartment {
    private EmailDeliveryService emailService;
    private String eventType;

    public MarketingDepartment(EmailDeliveryService emailService, String eventType) {
        this.emailService = emailService;
        this.eventType = eventType;
    }

    public void launchCampaign(String message) {
        System.out.println("Launching campaign: " + message);
        emailService.sendEmails(eventType, message);
    }
}
