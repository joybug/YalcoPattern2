package solid_princibles.liskov_substitution.ex01.compliant;

/**
 * Main 클래스: LSP를 준수하는 조류 시스템의 실행 클래스
 * 서로 다른 종류의 새들의 행동을 테스트하며 LSP 원칙 준수를 보여줌
 */
public class Main {
    /**
     * 프로그램의 진입점
     * 참새와 펭귄의 행동을 테스트하여 LSP 준수를 증명
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // 참새 인스턴스 생성 및 테스트
        Bird sparrow = new Sparrow();
        sparrow.eat(); // 모든 새가 가능한 기본 동작
        ((Flyable) sparrow).fly(); // 명시적 타입 변환을 통한 날기 동작 실행

        // 펭귄 인스턴스 생성 및 테스트
        Bird penguin = new Penguin();
        penguin.eat(); // 모든 새가 가능한 기본 동작
        // 펭귄은 Flyable을 구현하지 않으므로 fly() 메소드 호출 불가
        // ((Flyable) penguin).fly(); // 컴파일 에러 발생
    }
}
