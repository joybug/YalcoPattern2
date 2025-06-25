package behavioral_patterns.specification.ex02;

/**
 * Product 클래스는 상품의 속성(이름, 카테고리, 가격, 재고)을 저장합니다.
 */
public class Product {
    private String name;
    private String category;
    private int price;
    private int stock;

    public Product(String name, String category, int price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
}
