package solid_princibles.single_responsibility.noncompliant;

/**
 * 사용자 정보를 담는 모델 클래스
 */
class User {
    private String name;    // 사용자 이름
    private String email;   // 사용자 이메일

    /**
     * User 클래스의 생성자
     * @param name 사용자 이름
     * @param email 사용자 이메일 주소
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
