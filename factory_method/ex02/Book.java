package factory_method.ex02;
/**
 * Book 클래스 (도서)
 * - Product 인터페이스를 구현한 구체적인 제품 클래스
 * - 팩토리 메서드 패턴에서 '구체적 제품(Concrete Product)' 역할
 */
public class Book implements Product {
    @Override
    public void create() {
        System.out.println("Book product created.");  // 도서 생성 메시지 출력
    }
}