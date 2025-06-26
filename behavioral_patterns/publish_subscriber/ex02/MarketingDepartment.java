package behavioral_patterns.publish_subscriber.ex02;

/**
 * MarketingDepartment 클래스는 Publisher 역할로,
 * 캠페인 메시지를 EmailDeliveryService를 통해 발송합니다.
 */
class MarketingDepartment {
    /**
     * 이메일 발송 서비스 객체입니다.
     */
    private EmailDeliveryService emailService;
    /**
     * 캠페인 이벤트 타입입니다.
     */
    private String eventType;

    /**
     * MarketingDepartment 객체를 생성합니다.
     * @param emailService 이메일 발송 서비스
     * @param eventType 캠페인 이벤트 타입
     */
    public MarketingDepartment(EmailDeliveryService emailService, String eventType) {
        this.emailService = emailService;
        this.eventType = eventType;
    }

    /**
     * 캠페인을 시작하고, 이메일을 발송합니다.
     * @param message 발송할 메시지
     */
    public void launchCampaign(String message) {
        System.out.println("Launching campaign: " + message);
        emailService.sendEmails(eventType, message);
    }
}
