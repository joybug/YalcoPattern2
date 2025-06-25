package behavioral_patterns.specification.ex02;

/**
 * CategorySpec 클래스는 상품의 카테고리 조건을 판별합니다.
 */
public class CategorySpec implements Specification {
    private String category;

    public CategorySpec(String category) {
        this.category = category;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.getCategory().equals(category);
    }
}
