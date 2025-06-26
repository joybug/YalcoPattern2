package behavioral_patterns.specification.ex02;

/**
 * Specification 인터페이스는 상품 조건 판별 기능을 정의합니다.
 * 다양한 조건을 객체로 표현하고, 조합할 수 있습니다.
 */
public interface Specification {
    /**
     * 상품이 조건을 만족하는지 판별합니다.
     * @param item 검사할 상품
     * @return 조건을 만족하면 true, 아니면 false
     */
    boolean isSatisfiedBy(Product item);
}
