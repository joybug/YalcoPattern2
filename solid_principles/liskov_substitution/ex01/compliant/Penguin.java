package solid_principles.liskov_substitution.ex01.compliant;

/**
 * Penguin 클래스: 날 수 없는 새를 대표하는 펭귄 클래스
 * Bird 클래스만 상속받고 Flyable 인터페이스는 구현하지 않음
 * LSP를 준수하여 불필요한 기능을 강제로 구현하지 않음
 */
public class Penguin extends Bird {
    /**
     * 기본 생성자
     * 새로운 Penguin 인스턴스를 생성
     */
    public Penguin() {
        super();
    }
    // Flyable 인터페이스를 구현하지 않으므로 fly() 메소드가 없음
}
