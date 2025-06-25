package behavioral_patterns.specification.ex02;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ProductFilter 클래스는 Specification 조건에 따라 상품을 필터링합니다.
 */
public class ProductFilter {
    public static List<Product> filter(List<Product> items, Specification spec) {
        return items.stream().filter(spec::isSatisfiedBy).collect(Collectors.toList());
    }

    public static void printProducts(List<Product> products) {
        products.forEach(
            p -> System.out.println(p.getName() + " - " + p.getCategory() + " - $" + p.getPrice() + " - Stock: " + p.getStock())
        );
    }
}
