package factory_method.ex02;

/**
 * 메인 클래스 - 클라이언트 코드
 * - 팩토리 메서드 패턴을 실제로 사용하는 예제
 */
public class Main {
    public static void main(String[] args) {
        // 1. 구체적인 제품 공장 객체 생성 (ConcreteProductFactory)
        ProductFactory factory = new ConcreteProductFactory();
        
        // 2. 전자제품 주문: 공장에 "electronics" 타입을 전달하여 제품 생성 및 주문 처리
        Product electronics = factory.orderProduct("electronics");
        System.out.println("주문된 전자제품: " + electronics);
        
        // 3. 의류 주문: 공장에 "clothing" 타입을 전달하여 제품 생성 및 주문 처리
        Product clothing = factory.orderProduct("clothing");
        System.out.println("주문된 의류: " + clothing);
        
        // 4. 도서 주문: 공장에 "book" 타입을 전달하여 제품 생성 및 주문 처리
        Product book = factory.orderProduct("book");
        System.out.println("주문된 도서: " + book);
    }
}