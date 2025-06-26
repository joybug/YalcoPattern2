package behavioral_patterns.specification.ex02;

/**
 * PriceSpec 클래스는 상품의 최대 가격 조건을 판별합니다.
 * Specification 인터페이스를 구현합니다.
 */
public class PriceSpec implements Specification {
    /**
     * 허용하는 최대 가격입니다.
     */
    private int maxPrice;

    /**
     * PriceSpec 객체를 생성합니다.
     * @param maxPrice 최대 가격
     */
    public PriceSpec(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
     * 상품의 가격이 최대 가격 이하인지 판별합니다.
     * @param item 검사할 상품
     * @return 조건을 만족하면 true, 아니면 false
     */
    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.getPrice() <= maxPrice;
    }
}
