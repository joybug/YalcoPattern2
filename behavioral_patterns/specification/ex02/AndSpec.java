package behavioral_patterns.specification.ex02;

/**
 * AndSpec 클래스는 두 조건을 논리곱(AND)으로 결합합니다.
 */
public class AndSpec implements Specification {
    private Specification spec1;
    private Specification spec2;

    public AndSpec(Specification spec1, Specification spec2) {
        this.spec1 = spec1; this.spec2 = spec2;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return spec1.isSatisfiedBy(item) && spec2.isSatisfiedBy(item);
    }
}
