package solid_princibles.liskov_substitution.ex01.compliant;

/**
 * 모든 조류의 공통 특성을 정의하는 기본 클래스
 * LSP를 준수하여 모든 하위 클래스가 대체 가능하도록 설계
 */
public class Bird {
    /**
     * 모든 조류가 공통적으로 가지는 먹기 행위
     */
    public void eat() {
        // 조류의 기본적인 먹이 섭취 동작
        System.out.println("Bird is eating");
    }
}
