package behavioral_patterns.visitor.ex01;

/**
 * 둘레 계산 방문자(Concrete Visitor) 클래스입니다.
 * <p>
 * Visitor 인터페이스를 구현하여,
 * 각 도형의 둘레를 계산하는 visit() 메서드를 제공합니다.
 */
public class PerimeterVisitor implements Visitor {
    /**
     * 원의 둘레를 계산하여 출력합니다.
     * @param circle 방문할 원 객체
     */
    @Override
    public void visit(Circle circle) {
        // 원의 둘레: 2 * π * r
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Circle Perimeter: " + perimeter);
    }

    /**
     * 사각형의 둘레를 계산하여 출력합니다.
     * @param rectangle 방문할 사각형 객체
     */
    @Override
    public void visit(Rectangle rectangle) {
        // 사각형의 둘레: 2 * (가로 + 세로)
        double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
