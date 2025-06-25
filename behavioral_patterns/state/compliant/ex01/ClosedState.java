package behavioral_patterns.state.compliant.ex01;

/**
 * ClosedState 클래스는 문이 닫힌 상태에서의 동작을 정의합니다.
 */
public class ClosedState implements State {
    @Override
    public void open(Door door) {
        System.out.println("Door is now Open.");
        door.setState(new OpenState());
    }

    @Override
    public void close(Door door) {
        System.out.println("Door is already Closed.");
    }
}
