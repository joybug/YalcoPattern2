package behavioral_patterns.visitor.ex01;

/**
 * Visitor 패턴 도형 예제의 메인 클래스입니다.
 * <p>
 * Circle, Rectangle 객체에 대해 AreaVisitor(넓이), PerimeterVisitor(둘레) 방문자를 적용하여
 * 도형별로 다양한 연산이 가능함을 보여줍니다.
 */
public class Main {
    /**
     * 프로그램의 시작점(main 메서드)
     * <p>
     * 도형 객체와 방문자 객체를 생성하고, accept()를 통해 연산을 수행합니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 도형 객체 생성
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // 방문자(넓이, 둘레) 객체 생성
        Visitor areaVisitor = new AreaVisitor();
        Visitor perimeterVisitor = new PerimeterVisitor();

        System.out.println("Calculating Area:");
        circle.accept(areaVisitor);      // 원의 넓이 출력
        rectangle.accept(areaVisitor);   // 사각형의 넓이 출력

        System.out.println("\nCalculating Perimeter:");
        circle.accept(perimeterVisitor);     // 원의 둘레 출력
        rectangle.accept(perimeterVisitor);  // 사각형의 둘레 출력
    }
}
