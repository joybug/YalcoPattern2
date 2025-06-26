package behavioral_patterns.visitor.ex01;

/**
 * 넓이 계산 방문자(Concrete Visitor) 클래스입니다.
 * <p>
 * Visitor 인터페이스를 구현하여,
 * 각 도형의 넓이를 계산하는 visit() 메서드를 제공합니다.
 */
public class AreaVisitor implements Visitor {
    /**
     * 원의 넓이를 계산하여 출력합니다.
     * @param circle 방문할 원 객체
     */
    @Override
    public void visit(Circle circle) {
        // 원의 넓이: π * r^2
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Circle Area: " + area);
    }

    /**
     * 사각형의 넓이를 계산하여 출력합니다.
     * @param rectangle 방문할 사각형 객체
     */
    @Override
    public void visit(Rectangle rectangle) {
        // 사각형의 넓이: 가로 * 세로
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle Area: " + area);
    }
}
