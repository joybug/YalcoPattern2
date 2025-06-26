package behavioral_patterns.specification.ex02;

/**
 * OrSpec 클래스는 두 조건을 논리합(OR)으로 결합합니다.
 * Specification 인터페이스를 구현합니다.
 */
public class OrSpec implements Specification {
    /**
     * 결합할 첫 번째 조건입니다.
     */
    private Specification spec1;
    /**
     * 결합할 두 번째 조건입니다.
     */
    private Specification spec2;

    /**
     * OrSpec 객체를 생성합니다.
     * @param spec1 첫 번째 조건
     * @param spec2 두 번째 조건
     */
    public OrSpec(Specification spec1, Specification spec2) {
        this.spec1 = spec1; this.spec2 = spec2;
    }

    /**
     * 두 조건 중 하나라도 만족하는지 판별합니다.
     * @param item 검사할 상품
     * @return 둘 중 하나라도 만족하면 true, 아니면 false
     */
    @Override
    public boolean isSatisfiedBy(Product item) {
        return spec1.isSatisfiedBy(item) || spec2.isSatisfiedBy(item);
    }
}
