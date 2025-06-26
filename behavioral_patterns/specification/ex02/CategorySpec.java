package behavioral_patterns.specification.ex02;

/**
 * CategorySpec 클래스는 상품의 카테고리 조건을 판별합니다.
 * Specification 인터페이스를 구현합니다.
 */
public class CategorySpec implements Specification {
    /**
     * 비교할 카테고리명입니다.
     */
    private String category;

    /**
     * CategorySpec 객체를 생성합니다.
     * @param category 비교할 카테고리명
     */
    public CategorySpec(String category) {
        this.category = category;
    }

    /**
     * 상품의 카테고리가 지정된 카테고리와 일치하는지 판별합니다.
     * @param item 검사할 상품
     * @return 일치하면 true, 아니면 false
     */
    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.getCategory().equals(category);
    }
}
