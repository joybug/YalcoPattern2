package factory_method.ex02;
/**
 * Electronics 클래스 (전자제품)
 * - Product 인터페이스를 구현한 구체적인 제품 클래스
 * - 팩토리 메서드 패턴에서 '구체적 제품(Concrete Product)' 역할
 */
public class Electronics implements Product {
    @Override
    public void create() {
        System.out.println("Electronics product created.");  // 전자제품 생성 메시지 출력
    }
}