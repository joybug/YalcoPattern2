package solid_princibles.liskov_substitution.ex02.compliant;

/**
 * 도형의 면적을 계산하는 계산기 클래스
 * 리스코프 치환 원칙을 준수하여 모든 Shape 구현체를 동일하게 처리
 */
class AreaCalculator {
    /**
     * 주어진 도형의 면적을 계산하고 출력하는 메소드
     * @param shape 면적을 계산할 도형 객체
     */
    public void calculateArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }
}
