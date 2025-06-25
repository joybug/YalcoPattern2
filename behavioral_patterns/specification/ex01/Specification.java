package behavioral_patterns.specification.ex01;

/**
 * Specification 인터페이스는 조건 판별 및 조합(and) 기능을 정의합니다.
 */
public interface Specification {
    /**
     * 주어진 숫자가 조건을 만족하는지 판별합니다.
     */
    boolean isSatisfiedBy(int number);

    /**
     * 두 Specification을 and(논리곱)로 결합합니다.
     */
    default Specification and(Specification other) {
        return number -> this.isSatisfiedBy(number) && other.isSatisfiedBy(number);
    }
}
