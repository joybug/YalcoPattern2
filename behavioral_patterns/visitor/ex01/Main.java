package behavioral_patterns.visitor.ex01;

/**
 * Visitor 패턴 도형 예제의 메인 클래스
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Visitor areaVisitor = new AreaVisitor();
        Visitor perimeterVisitor = new PerimeterVisitor();

        System.out.println("Calculating Area:");
        circle.accept(areaVisitor);
        rectangle.accept(areaVisitor);

        System.out.println("\nCalculating Perimeter:");
        circle.accept(perimeterVisitor);
        rectangle.accept(perimeterVisitor);
    }
}
