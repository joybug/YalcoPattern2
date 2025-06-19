package solid_princibles.single_responsibility.compliant;

/**
 * 이메일 발송을 전담하는 서비스 클래스
 * 단일 책임: 이메일 관련 기능만 처리
 */
public class EmailService {
    /**
     * 신규 사용자에게 환영 이메일을 발송하는 메소드
     * @param user 이메일을 받을 사용자 객체
     */
    public void sendWelcomeEmail(User user) {
        // 이메일 서버 연결 및 메일 발송 로직
        System.out.println("Welcome email sent to: " + user.getEmail());
    }
}
