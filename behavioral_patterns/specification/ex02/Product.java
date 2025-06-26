package behavioral_patterns.specification.ex02;

/**
 * Product 클래스는 상품의 속성(이름, 카테고리, 가격, 재고)을 저장합니다.
 */
public class Product {
    /**
     * 상품 이름입니다.
     */
    private String name;
    /**
     * 상품 카테고리입니다.
     */
    private String category;
    /**
     * 상품 가격입니다.
     */
    private int price;
    /**
     * 상품 재고 수량입니다.
     */
    private int stock;

    /**
     * Product 객체를 생성합니다.
     * @param name 상품 이름
     * @param category 상품 카테고리
     * @param price 상품 가격
     * @param stock 상품 재고
     */
    public Product(String name, String category, int price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    /**
     * 상품 이름을 반환합니다.
     * @return 상품 이름
     */
    public String getName() { return name; }
    /**
     * 상품 카테고리를 반환합니다.
     * @return 상품 카테고리
     */
    public String getCategory() { return category; }
    /**
     * 상품 가격을 반환합니다.
     * @return 상품 가격
     */
    public double getPrice() { return price; }
    /**
     * 상품 재고를 반환합니다.
     * @return 상품 재고
     */
    public int getStock() { return stock; }
}
