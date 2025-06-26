package behavioral_patterns.specification.ex02;

import java.util.Arrays;
import java.util.List;

/**
 * Main 클래스는 다양한 상품 조건 조합(Specification 패턴) 예제를 실행합니다.
 * 카테고리, 재고, 가격 조건을 조합하여 상품을 필터링합니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 상품 목록 생성
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200, 5),
                new Product("Smartphone", "Electronics", 800, 0),
                new Product("Headphones", "Electronics", 200, 10),
                new Product("Book", "Literature", 20, 50)
        );

        // 조건 객체 생성
        Specification electronicsSpec = new CategorySpec("Electronics");
        Specification inStockSpec = new InStockSpec();
        Specification expensiveSpec = new PriceSpec(500);

        // 조건 조합
        Specification electronicInStock = new AndSpec(electronicsSpec, inStockSpec);
        Specification electronicOrInStock = new OrSpec(electronicsSpec, inStockSpec);
        Specification notExpensive = new NotSpec(expensiveSpec);

        // 각 조건별로 상품 필터링 및 출력
        System.out.println("Electronics in stock:");
        ProductFilter.printProducts(ProductFilter.filter(products, electronicInStock));

        System.out.println("\nElectronics or items in stock:");
        ProductFilter.printProducts(ProductFilter.filter(products, electronicOrInStock));

        System.out.println("\nNot expensive items:");
        ProductFilter.printProducts(ProductFilter.filter(products, notExpensive));
    }
}
