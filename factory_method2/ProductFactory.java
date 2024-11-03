package factory_method2;
/**
 * ProductFactory 추상 클래스
 * - 제품을 생성하고 주문하는 과정을 정의하는 추상 클래스
 * - 팩토리 메서드 패턴에서 '추상 생산자(Abstract Creator)' 역할
 * - 템플릿 메서드 패턴도 함께 사용됨 (orderProduct 메서드)
 */
public abstract class ProductFactory {
    /**
     * 팩토리 메서드 - 실제 Product 객체를 생성하는 추상 메서드
     * - 하위 클래스에서 구체적인 제품 생성 로직을 구현해야 함
     * @param type 생성할 제품의 종류
     * @return 생성된 Product 객체
     */
    public abstract Product createProduct(String type);
    
    /**
     * 제품 주문 프로세스를 관리하는 템플릿 메서드
     * - 제품 생성과 초기화를 순차적으로 처리
     * @param type 주문할 제품의 종류
     * @return 생성 및 초기화된 Product 객체
     */
    public Product orderProduct(String type) {
        // 1. 팩토리 메서드를 통해 제품 객체 생성
        Product product = createProduct(type);
        // 2. 제품 초기화 (create 메서드 호출)
        product.create();
        // 3. 생성된 제품 반환
        return product;
    }
}