package solid_principles.liskov_substitution.ex01.compliant;

/**
 * Bird 클래스: 모든 조류의 공통 특성을 정의하는 기본 클래스
 * LSP를 준수하여 모든 하위 클래스가 대체 가능하도록 설계
 * 모든 새가 공통적으로 가지는 특성만을 포함
 */
public class Bird {
    /**
     * 기본 생성자
     * 새로운 Bird 인스턴스를 생성
     */
    public Bird() {
    }

    /**
     * 모든 조류가 공통적으로 가지는 먹기 행위
     * 모든 새는 먹이를 먹을 수 있으므로 기본 클래스에 정의
     */
    public void eat() {
        // 조류의 기본적인 먹이 섭취 동작을 콘솔에 출력
        System.out.println("Bird is eating");
    }
}
