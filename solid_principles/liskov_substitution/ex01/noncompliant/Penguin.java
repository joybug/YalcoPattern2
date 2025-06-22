package solid_principles.liskov_substitution.ex01.noncompliant;

/**
 * Penguin 클래스: Bird 클래스를 상속받는 펭귄 클래스
 * LSP 원칙을 위반하는 예시를 보여주는 클래스
 * 펭귄은 날 수 없지만 Bird 클래스의 fly() 메소드를 상속받아야 함
 */
public class Penguin extends Bird {
    /**
     * 기본 생성자
     * 새로운 Penguin 인스턴스를 생성합니다.
     */
    public Penguin() {
        super();
    }

    /**
     * Bird 클래스의 fly 메소드를 오버라이드
     * LSP 위반: 부모 클래스의 동작을 제대로 수행할 수 없음
     * @throws UnsupportedOperationException 펭귄은 날 수 없으므로 예외 발생
     */
    @Override
    public void fly() {
        // 펭귄은 날 수 없으므로 예외를 발생시킴
        // 이는 LSP를 위반하는 전형적인 예시임
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}
