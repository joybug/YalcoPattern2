package factory_method.ex02;
/**
 * ConcreteProductFactory 클래스
 * - ProductFactory를 상속받아 실제 제품 생성 로직을 구현하는 구체적인 공장 클래스
 * - 팩토리 메서드 패턴에서 '구체적 생산자(Concrete Creator)' 역할
 * - 각 제품 타입에 따른 객체 생성을 담당
 */
public class ConcreteProductFactory extends ProductFactory {
    @Override
    public Product createProduct(String type) {
        // type 파라미터를 기반으로 적절한 제품 객체를 생성
        if (type.equalsIgnoreCase("electronics")) {
            return new Electronics();  // 전자제품 생성
        } else if (type.equalsIgnoreCase("clothing")) {
            return new Clothing();     // 의류 생성
        } else if (type.equalsIgnoreCase("book")) {
            return new Book();         // 도서 생성
        } else {
            // 알 수 없는 제품 타입인 경우 예외 발생
            throw new IllegalArgumentException(
                "Unknown product type."
            );
        }
    }
}