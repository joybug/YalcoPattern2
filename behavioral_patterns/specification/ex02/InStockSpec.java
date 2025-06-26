package behavioral_patterns.specification.ex02;

/**
 * InStockSpec 클래스는 상품의 재고 여부를 판별합니다.
 * Specification 인터페이스를 구현합니다.
 */
public class InStockSpec implements Specification {
    /**
     * 상품의 재고가 1개 이상인지 판별합니다.
     * @param item 검사할 상품
     * @return 재고가 있으면 true, 아니면 false
     */
    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.getStock() > 0;
    }
}
