package solid_principles.liskov_substitution.ex02.compliant;

/**
 * 정사각형을 표현하는 클래스
 * Shape 인터페이스 구현
 */
class Square implements Shape {
    private int side;

    /**
     * 정사각형 생성자
     * @param side 한 변의 길이
     */
    public Square(int side) {
        this.side = side;
    }

    /**
     * 정사각형의 면적을 계산하는 메소드
     * @return 한 변의 제곱으로 계산된 면적
     */
    @Override
    public int getArea() {
        return side * side;
    }
}
