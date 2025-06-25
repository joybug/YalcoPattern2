package behavioral_patterns.specification.ex02;

/**
 * PriceSpec 클래스는 상품의 최대 가격 조건을 판별합니다.
 */
public class PriceSpec implements Specification {
    private int maxPrice;

    public PriceSpec(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.getPrice() <= maxPrice;
    }
}
