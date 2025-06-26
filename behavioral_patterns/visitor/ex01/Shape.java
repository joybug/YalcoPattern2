package behavioral_patterns.visitor.ex01;

/**
 * 도형(Element) 인터페이스입니다.
 * <p>
 * Visitor 객체를 받아들이는 accept() 메서드를 정의합니다.
 * 각 도형(Circle, Rectangle)은 이 인터페이스를 구현합니다.
 */
public interface Shape {
    /**
     * Visitor 객체를 받아들이는 메서드입니다.
     * @param visitor 방문자 객체
     */
    void accept(Visitor visitor);
}
