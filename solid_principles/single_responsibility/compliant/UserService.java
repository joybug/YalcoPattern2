package solid_principles.single_responsibility.compliant;

/**
 * 단일 책임 원칙을 준수하는 사용자 서비스 클래스
 * 각 책임을 별도의 클래스로 분리하고 이를 조합하여 사용
 */
public class UserService {
    // 각 책임별로 분리된 클래스들의 인스턴스
    private UserRepository userRepository = new UserRepository();
    private EmailService emailService = new EmailService();
    private UserActivityLogger userActivityLogger = new UserActivityLogger();

    /**
     * 사용자 등록을 처리하는 통합 메소드
     * 각 책임을 가진 클래스들을 조합하여 사용
     * @param user 등록할 사용자 객체
     */
    public void registerUser(User user) {
        // 사용자 정보 저장
        userRepository.saveUser(user);
        // 환영 이메일 발송
        emailService.sendWelcomeEmail(user);
        // 사용자 활동 로깅
        userActivityLogger.logUserActivity(user);
    }
}
