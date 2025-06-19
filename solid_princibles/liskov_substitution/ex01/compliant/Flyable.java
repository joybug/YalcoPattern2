package solid_princibles.liskov_substitution.ex01.compliant;

/**
 * Flyable 인터페이스: 날 수 있는 기능을 정의
 * LSP를 준수하기 위해 비행 능력을 별도 인터페이스로 분리
 * 날 수 있는 새들만 이 인터페이스를 구현하여 LSP 원칙 준수
 */
public interface Flyable {
    /**
     * 날기 동작을 정의하는 추상 메소드
     * 이 인터페이스를 구현하는 모든 클래스는 반드시 fly() 메소드를 구현해야 함
     * @throws 어떤 예외도 발생시키지 않아야 함 (LSP 준수)
     */
    void fly();
}
