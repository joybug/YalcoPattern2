package solid_principles.liskov_substitution.ex02.noncompliant;

/**
 * 직사각형을 나타내는 기본 클래스
 * LSP 원칙을 위반하는 예제의 상위 클래스
 */
class Rectangle {
    // 가로 길이를 저장하는 protected 변수
    protected int width;
    // 세로 길이를 저장하는 protected 변수
    protected int height;

    /**
     * 직사각형의 가로 길이를 설정하는 메서드
     * @param width 설정할 가로 길이
     */
    public void setWidth(int width) {
        // 가로 길이만 변경
        this.width = width;
    }

    /**
     * 직사각형의 세로 길이를 설정하는 메서드
     * @param height 설정할 세로 길이
     */
    public void setHeight(int height) {
        // 세로 길이만 변경
        this.height = height;
    }

    /**
     * 직사각형의 넓이를 계산하여 반환하는 메서드
     * @return 가로 * 세로로 계산된 넓이
     */
    public int getArea() {
        // 직사각형의 넓이 = 가로 * 세로
        return width * height;
    }
}
