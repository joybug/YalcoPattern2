package factory_method.ex02;

/**
 * 메인 클래스 - 클라이언트 코드
 * - 팩토리 메서드 패턴을 실제로 사용하는 예제
 */
public class Main {
    public static void main(String[] args) {
        // 제품 공장 객체 생성
        ProductFactory factory = new ConcreteProductFactory();
        
        // 다양한 제품들을 생성하고 주문
        // 전자제품 주문
        Product electronics = factory.orderProduct("electronics");
        
        // 의류 주문
        Product clothing = factory.orderProduct("clothing");
        
        // 도서 주문
        Product book = factory.orderProduct("book");
    }
}