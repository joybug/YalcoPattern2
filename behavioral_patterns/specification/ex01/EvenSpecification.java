package behavioral_patterns.specification.ex01;

/**
 * EvenSpecification 클래스는 짝수 여부를 판별하는 조건입니다.
 */
class EvenSpecification implements Specification {
    @Override
    public boolean isSatisfiedBy(int number) {
        return number % 2 == 0;
    }
}
