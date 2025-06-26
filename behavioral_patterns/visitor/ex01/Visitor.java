package behavioral_patterns.visitor.ex01;

/**
 * 방문자(Visitor) 인터페이스입니다.
 * <p>
 * 각 도형(Circle, Rectangle)에 대해 방문(visit)하여,
 * 다양한 연산(넓이, 둘레 등)을 수행할 수 있도록 메서드를 정의합니다.
 */
public interface Visitor {
    /**
     * 원(Circle) 객체를 방문하여 연산을 수행합니다.
     * @param circle 방문할 원 객체
     */
    void visit(Circle circle);
    /**
     * 사각형(Rectangle) 객체를 방문하여 연산을 수행합니다.
     * @param rectangle 방문할 사각형 객체
     */
    void visit(Rectangle rectangle);
}
