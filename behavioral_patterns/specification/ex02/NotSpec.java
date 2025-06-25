package behavioral_patterns.specification.ex02;

/**
 * NotSpec 클래스는 조건의 부정(NOT)을 구현합니다.
 */
public class NotSpec implements Specification {
    private Specification spec;

    public NotSpec(Specification spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return !spec.isSatisfiedBy(item);
    }
}
