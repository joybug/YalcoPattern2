package behavioral_patterns.specification.ex01;

/**
 * RangeSpecification 클래스는 숫자가 특정 범위 내에 있는지 판별하는 조건입니다.
 */
class RangeSpecification implements Specification {
    private int min;
    private int max;

    public RangeSpecification(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isSatisfiedBy(int number) {
        return number >= min && number <= max;
    }
}
