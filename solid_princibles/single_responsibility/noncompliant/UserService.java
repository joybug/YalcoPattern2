package solid_princibles.single_responsibility.noncompliant;

/**
 * 단일 책임 원칙을 위반하는 사용자 서비스 클래스
 * 사용자 저장, 이메일 발송, 로깅 등 여러 책임을 한 클래스에서 처리함
 */
public class UserService {
    /**
     * 사용자 정보를 데이터베이스에 저장하는 메소드
     * @param user 저장할 사용자 객체
     */
    public void saveUser(User user) {
        // 데이터베이스에 사용자 정보 저장하는 로직
        System.out.println("User saved to database: " + user.getName());
    }

    /**
     * 사용자에게 환영 이메일을 발송하는 메소드
     * @param user 이메일을 받을 사용자 객체
     */
    public void sendWelcomeEmail(User user) {
        // 이메일 서버에 연결하여 환영 메일을 발송하는 로직
        System.out.println("Welcome email sent to: " + user.getEmail());
    }

    /**
     * 사용자 활동을 로깅하는 메소드
     * @param user 활동을 기록할 사용자 객체
     */
    public void logUserActivity(User user) {
        // 사용자의 활동 정보를 로그 시스템에 기록하는 로직
        System.out.println("Logging activity for user: " + user.getName());
    }
}
