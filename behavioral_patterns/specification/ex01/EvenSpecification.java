package behavioral_patterns.specification.ex01;

/**
 * EvenSpecification 클래스는 짝수 여부를 판별하는 조건입니다.
 * Specification 인터페이스를 구현합니다.
 */
class EvenSpecification implements Specification {
    /**
     * 숫자가 짝수인지 판별합니다.
     * @param number 검사할 숫자
     * @return 짝수면 true, 아니면 false
     */
    @Override
    public boolean isSatisfiedBy(int number) {
        // 2로 나누어 떨어지면 짝수
        return number % 2 == 0;
    }
}
