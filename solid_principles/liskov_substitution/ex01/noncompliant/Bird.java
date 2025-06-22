package solid_principles.liskov_substitution.ex01.noncompliant;

/**
 * Bird 클래스: 모든 새의 기본 동작을 정의하는 부모 클래스
 * LSP 원칙을 위반하는 예제에서 사용되는 기본 클래스
 */
public class Bird {
    /**
     * 기본 생성자
     * 새로운 Bird 인스턴스를 생성합니다.
     */
    public Bird() {
    }

    /**
     * 새가 날 수 있는 기능을 구현한 메소드
     * 모든 새가 날 수 있다고 가정합니다.
     */
    public void fly() {
        // 새가 나는 동작을 콘솔에 출력
        System.out.println("Bird is flying");
    }
}
