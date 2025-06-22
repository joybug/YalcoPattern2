package solid_principles.liskov_substitution.ex02.noncompliant;

/**
 * 도형의 면적을 계산하는 클래스
 * LSP 위반을 보여주는 클라이언트 코드
 */
class AreaCalculator {
    /**
     * Rectangle 객체의 면적을 계산하고 출력하는 메서드
     * Rectangle 대신 Square가 들어올 경우 예상치 못한 결과가 발생함
     * @param rectangle 면적을 계산할 Rectangle 객체
     */
    public void calculateArea(Rectangle rectangle) {
        // 가로를 5로 설정
        rectangle.setWidth(5);
        // 세로를 4로 설정
        rectangle.setHeight(4);
        // 계산된 면적을 출력
        System.out.println("Area: " + rectangle.getArea());
        // Rectangle의 경우 예상 출력: Area: 20
        // Square의 경우 실제 출력: Area: 16 (LSP 위반)
    }
}
