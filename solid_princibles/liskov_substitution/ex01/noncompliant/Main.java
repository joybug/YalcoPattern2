package solid_princibles.liskov_substitution.ex01.noncompliant;

/**
 * Main 클래스: LSP 위반 사례를 테스트하는 실행 클래스
 * Bird와 Penguin 객체를 생성하고 동작을 테스트
 */
public class Main {
    /**
     * 프로그램의 진입점
     * Bird와 Penguin 인스턴스를 생성하고 fly() 메소드를 호출하여 LSP 위반을 보여줌
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // Bird 인스턴스 생성 및 테스트
        Bird bird = new Bird();
        bird.fly(); // 정상적으로 "Bird is flying" 출력

        // Penguin 인스턴스를 Bird 타입으로 생성 (다형성)
        Bird penguin = new Penguin();
        penguin.fly(); // UnsupportedOperationException 발생
        // LSP 위반: 자식 클래스(Penguin)가 부모 클래스(Bird)의 동작을 제대로 수행하지 못함
    }
}
