package behavioral_patterns.visitor.ex01;

/**
 * 방문자(Visitor) 인터페이스
 */
public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
