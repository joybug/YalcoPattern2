package solid_princibles.liskov_substitution.ex01.compliant;

/**
 * 리스코프 치환 원칙(LSP)을 준수하는 조류 시스템의 실행 클래스
 * 서로 다른 종류의 새들의 행동을 테스트
 */
public class Main {
    /**
     * 프로그램의 진입점
     * 참새와 펭귄의 행동을 테스트
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // 참새 테스트 - 날 수 있는 새
        Bird sparrow = new Sparrow();
        sparrow.eat(); // Bird is eating
        ((Flyable) sparrow).fly(); // Sparrow is flying

        // 펭귄 테스트 - 날 수 없는 새
        Bird penguin = new Penguin();
        penguin.eat(); // Bird is eating
        // ((Flyable) penguin).fly(); // Compilation error, Penguin is not Flyable
    }
}
