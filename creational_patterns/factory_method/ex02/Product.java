package factory_method.ex02;
/**
 * Product 인터페이스
 * - 모든 제품들이 공통적으로 구현해야 하는 기본 인터페이스
 * - 팩토리 메서드 패턴에서 '추상 제품(Abstract Product)' 역할
 */
public interface Product {
    // 제품 생성 시 실행되는 메서드
    void create();
}