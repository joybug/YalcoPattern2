package solid_princibles.interface_segregation.noncompliant;

/**
 * Robot 클래스 - Worker 인터페이스 구현
 * ISP 위반 사례를 보여주는 클래스
 * Robot은 eat() 메서드가 불필요하지만 구현해야 함
 */
public class Robot implements Worker {
    /**
     * Robot의 작업 수행 메서드
     * 로봇이 작업하는 것을 콘솔에 출력
     */
    @Override
    public void work() {
        // 로봇의 작업 수행을 콘솔에 출력
        System.out.println("Robot is working");
    }

    /**
     * Robot의 불필요한 eat 메서드
     * 로봇은 먹을 수 없으므로 예외를 발생시킴
     * @throws UnsupportedOperationException 항상 발생
     */
    @Override
    public void eat() {
        // 로봇은 먹을 수 없으므로 예외 발생
        throw new UnsupportedOperationException("Robots do not eat");
    }
}
