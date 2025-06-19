package solid_princibles.single_responsibility.compliant;

/**
 * 사용자 정보를 저장하는 클래스
 * 단일 책임 원칙(SRP)을 준수하여 사용자의 기본 정보만을 관리
 */
public class User {
    /** 사용자 이름 */
    private String name;
    /** 사용자 이메일 주소 */
    private String email;

    /**
     * 사용자 객체를 생성하는 생성자
     * @param name 사용자 이름
     * @param email 사용자 이메일
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * 사용자 이름을 반환하는 getter 메소드
     * @return 사용자 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 사용자 이메일을 반환하는 getter 메소드
     * @return 사용자 이메일
     */
    public String getEmail() {
        return email;
    }
}
