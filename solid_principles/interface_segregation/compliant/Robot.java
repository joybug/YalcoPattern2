package solid_principles.interface_segregation.compliant;

/**
 * Robot 클래스 - Workable 인터페이스만 구현
 * ISP를 준수하는 예제
 * 필요한 인터페이스만 구현하여 불필요한 메서드를 강제하지 않음
 */
public class Robot implements Workable {
    /**
     * Robot의 작업 수행 메서드
     * 로봇이 작업하는 것을 콘솔에 출력
     */
    @Override
    public void work() {
        // 로봇의 작업 수행을 콘솔에 출력
        System.out.println("Robot is working");
    }
}
