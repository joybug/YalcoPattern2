package solid_principles.single_responsibility.compliant;

/**
 * UserRepository 클래스 - 사용자 데이터를 데이터베이스에 저장하는 책임을 가진 클래스
 * 단일 책임 원칙(SRP)을 준수하여 사용자 관련 데이터 저장 기능만을 담당
 */

public class UserRepository {
    /**
     * 사용자 정보를 데이터베이스에 저장하는 메소드
     * @param user 저장할 사용자 객체
     */
    public void saveUser(User user) {
        // 데이터베이스 연결 및 사용자 정보 저장 로직
        System.out.println("User saved to database: " + user.getName());
    }
}
