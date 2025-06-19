package solid_princibles.liskov_substitution.ex01.compliant;

/**
 * 날 수 있는 기능을 정의하는 인터페이스
 * 리스코프 치환 원칙을 준수하기 위해 비행 능력을 별도로 분리
 */
public interface Flyable {
    /**
     * 날기 동작을 정의하는 추상 메소드
     * 실제 비행 가능한 새들만 이 인터페이스를 구현
     */
    void fly();
}
