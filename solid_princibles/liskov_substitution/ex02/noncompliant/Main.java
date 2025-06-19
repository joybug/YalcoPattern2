package solid_princibles.liskov_substitution.ex02.noncompliant;

/**
 * LSP 위반을 테스트하는 메인 클래스
 */
public class Main {
    /**
     * 프로그램의 진입점
     * Rectangle과 Square 객체를 생성하여 LSP 위반을 시연
     * @param args 커맨드 라인 인자
     */
    public static void main(String[] args) {
        // 면적 계산기 객체 생성
        AreaCalculator calculator = new AreaCalculator();

        // Rectangle 객체로 테스트
        Rectangle rectangle = new Rectangle();
        calculator.calculateArea(rectangle); // 정상적인 결과: Area: 20

        // Square 객체로 테스트 (LSP 위반 발생)
        Square square = new Square();
        calculator.calculateArea(square); // 예상치 못한 결과: Area: 16
    }
}

