package behavioral_patterns.specification.ex01;

/**
 * Specification 인터페이스는 조건 판별 및 조건 조합(and) 기능을 정의합니다.
 * 다양한 조건을 객체로 표현하고, 조합할 수 있습니다.
 */
public interface Specification {
    /**
     * 주어진 숫자가 조건을 만족하는지 판별합니다.
     * @param number 검사할 숫자
     * @return 조건을 만족하면 true, 아니면 false
     */
    boolean isSatisfiedBy(int number);

    /**
     * 두 Specification을 and(논리곱)으로 결합합니다.
     * @param other 결합할 다른 Specification
     * @return 결합된 Specification
     */
    default Specification and(Specification other) {
        // 두 조건을 모두 만족해야 true 반환
        return number -> this.isSatisfiedBy(number) && other.isSatisfiedBy(number);
    }
}
