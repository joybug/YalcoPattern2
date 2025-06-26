package behavioral_patterns.specification.ex01;

/**
 * RangeSpecification 클래스는 숫자가 특정 범위 내에 있는지 판별하는 조건입니다.
 * Specification 인터페이스를 구현합니다.
 */
class RangeSpecification implements Specification {
    /**
     * 범위의 최소값입니다.
     */
    private int min;
    /**
     * 범위의 최대값입니다.
     */
    private int max;

    /**
     * RangeSpecification 객체를 생성합니다.
     * @param min 최소값
     * @param max 최대값
     */
    public RangeSpecification(int min, int max) {
        this.min = min;
        this.max = max;
    }

    /**
     * 숫자가 범위 내에 있는지 판별합니다.
     * @param number 검사할 숫자
     * @return 범위 내면 true, 아니면 false
     */
    @Override
    public boolean isSatisfiedBy(int number) {
        // min 이상 max 이하이면 true
        return number >= min && number <= max;
    }
}
