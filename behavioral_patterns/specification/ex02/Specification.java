package behavioral_patterns.specification.ex02;

/**
 * Specification 인터페이스는 상품 조건 판별 기능을 정의합니다.
 */
public interface Specification {
    boolean isSatisfiedBy(Product item);
}
