package behavioral_patterns.specification.ex02;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ProductFilter 클래스는 Specification 조건에 따라 상품을 필터링합니다.
 */
public class ProductFilter {
    /**
     * 주어진 조건에 맞는 상품만 필터링하여 리스트로 반환합니다.
     * @param items 상품 목록
     * @param spec 조건 객체
     * @return 조건을 만족하는 상품 리스트
     */
    public static List<Product> filter(List<Product> items, Specification spec) {
        return items.stream().filter(spec::isSatisfiedBy).collect(Collectors.toList());
    }

    /**
     * 상품 리스트의 정보를 콘솔에 출력합니다.
     * @param products 출력할 상품 리스트
     */
    public static void printProducts(List<Product> products) {
        products.forEach(
            p -> System.out.println(p.getName() + " - " + p.getCategory() + " - $" + p.getPrice() + " - Stock: " + p.getStock())
        );
    }
}
