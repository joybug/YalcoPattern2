package behavioral_patterns.visitor.ex01;

/**
 * 원(Circle) 클래스 - 구체 도형 클래스입니다.
 * <p>
 * Shape 인터페이스를 구현하며, accept()를 통해 Visitor를 받아들입니다.
 */
public class Circle implements Shape {
    /**
     * 원의 반지름
     */
    private double radius;

    /**
     * Circle 생성자입니다.
     * @param radius 원의 반지름
     */
    public Circle(double radius) {
        // 반지름 필드 초기화
        this.radius = radius;
    }

    /**
     * 원의 반지름을 반환합니다.
     * @return 반지름 값
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Visitor를 받아들이고, 자신(this)을 방문하도록 위임합니다.
     * @param visitor 방문자 객체
     */
    @Override
    public void accept(Visitor visitor) {
        // Visitor의 visit(Circle) 호출
        visitor.visit(this);
    }
}
