package behavioral_patterns.visitor.ex01;

/**
 * 사각형(Rectangle) 클래스 - 구체 도형 클래스입니다.
 * <p>
 * Shape 인터페이스를 구현하며, accept()를 통해 Visitor를 받아들입니다.
 */
public class Rectangle implements Shape {
    /**
     * 사각형의 가로, 세로 길이
     */
    private double width, height;

    /**
     * Rectangle 생성자입니다.
     * @param width 가로 길이
     * @param height 세로 길이
     */
    public Rectangle(double width, double height) {
        // 필드 초기화
        this.width = width;
        this.height = height;
    }

    /**
     * 사각형의 가로 길이를 반환합니다.
     * @return 가로 길이
     */
    public double getWidth() {
        return width;
    }

    /**
     * 사각형의 세로 길이를 반환합니다.
     * @return 세로 길이
     */
    public double getHeight() {
        return height;
    }

    /**
     * Visitor를 받아들이고, 자신(this)을 방문하도록 위임합니다.
     * @param visitor 방문자 객체
     */
    @Override
    public void accept(Visitor visitor) {
        // Visitor의 visit(Rectangle) 호출
        visitor.visit(this);
    }
}
