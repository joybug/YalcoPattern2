package behavioral_patterns.specification.ex02;

/**
 * NotSpec 클래스는 조건의 부정(NOT)을 구현합니다.
 * Specification 인터페이스를 구현합니다.
 */
public class NotSpec implements Specification {
    /**
     * 부정할 조건입니다.
     */
    private Specification spec;

    /**
     * NotSpec 객체를 생성합니다.
     * @param spec 부정할 조건
     */
    public NotSpec(Specification spec) {
        this.spec = spec;
    }

    /**
     * 조건을 만족하지 않으면 true를 반환합니다.
     * @param item 검사할 상품
     * @return 조건을 만족하지 않으면 true, 만족하면 false
     */
    @Override
    public boolean isSatisfiedBy(Product item) {
        return !spec.isSatisfiedBy(item);
    }
}
