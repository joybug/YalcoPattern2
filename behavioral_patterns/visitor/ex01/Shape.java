package behavioral_patterns.visitor.ex01;

/**
 * 도형(Element) 인터페이스
 */
public interface Shape {
    void accept(Visitor visitor);
}
