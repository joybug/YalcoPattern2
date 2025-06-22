package solid_principles.liskov_substitution.ex01.compliant;

/**
 * Sparrow 클래스: 날 수 있는 새를 대표하는 참새 클래스
 * Bird 클래스를 상속받고 Flyable 인터페이스를 구현
 */
public class Sparrow extends Bird implements Flyable {
    /**
     * 기본 생성자
     * 새로운 Sparrow 인스턴스를 생성
     */
    public Sparrow() {
        super();
    }

    /**
     * Flyable 인터페이스의 fly 메소드 구현
     * 참새의 비행 동작을 정의
     */
    @Override
    public void fly() {
        // 참새가 나는 동작을 콘솔에 출력
        System.out.println("Sparrow is flying");
    }
}
