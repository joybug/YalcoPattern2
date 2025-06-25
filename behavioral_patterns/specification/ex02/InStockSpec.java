package behavioral_patterns.specification.ex02;

/**
 * InStockSpec 클래스는 상품의 재고 여부를 판별합니다.
 */
public class InStockSpec implements Specification {
    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.getStock() > 0;
    }
}
