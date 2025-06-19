package solid_princibles.liskov_substitution.ex02.compliant;

/**
 * 직사각형을 표현하는 클래스
 * Shape 인터페이스 구현
 */
class Rectangle implements Shape {
    private int width;
    private int height;

    /**
     * 직사각형 생성자
     * @param width 가로 길이
     * @param height 세로 길이
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * 직사각형의 면적을 계산하는 메소드
     * @return 가로 * 세로로 계산된 면적
     */
    @Override
    public int getArea() {
        return width * height;
    }
}
