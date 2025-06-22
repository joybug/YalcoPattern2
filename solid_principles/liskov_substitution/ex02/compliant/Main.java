package solid_principles.liskov_substitution.ex02.compliant;

/**
 * 리스코프 치환 원칙(LSP)을 준수하는 도형 계산 시스템의 실행 클래스
 * 서로 다른 도형 객체들의 면적 계산을 테스트
 */
public class Main {
    /**
     * 프로그램의 진입점
     * 직사각형과 정사각형의 면적 계산을 테스트
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // 직사각형 면적 계산 테스트
        Shape rectangle = new Rectangle(5, 4);
        calculator.calculateArea(rectangle); // Output: Area: 20

        // 정사각형 면적 계산 테스트
        Shape square = new Square(5);
        calculator.calculateArea(square); // Output: Area: 25 (Expected)
    }
}
