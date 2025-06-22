package solid_principles.single_responsibility.compliant;

/**
 * 사용자 활동을 기록하는 로깅 전용 클래스
 * 단일 책임 원칙(SRP)을 준수하여 로깅 기능만을 담당
 */
public class UserActivityLogger {
    /**
     * 사용자 활동을 로그로 기록하는 메소드
     * @param user 활동을 기록할 사용자 객체
     */
    public void logUserActivity(User user) {
        // 사용자 활동 로깅 처리
        System.out.println("Logging activity for user: " + user.getName());
    }
}
