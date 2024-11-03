package factory_method2;
/**
 * Clothing 클래스 (의류)
 * - Product 인터페이스를 구현한 구체적인 제품 클래스
 * - 팩토리 메서드 패턴에서 '구체적 제품(Concrete Product)' 역할
 */
public class Clothing implements Product {
    @Override
    public void create() {
        System.out.println("Clothing product created.");  // 의류 생성 메시지 출력
    }
}