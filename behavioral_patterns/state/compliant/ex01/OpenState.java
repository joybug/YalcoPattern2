package behavioral_patterns.state.compliant.ex01;

/**
 * OpenState 클래스는 문이 열린 상태에서의 동작을 정의합니다.
 */
public class OpenState implements State {
    @Override
    public void open(Door door) {
        System.out.println("Door is already Open.");
    }

    @Override
    public void close(Door door) {
        System.out.println("Door is now Closed.");
        door.setState(new ClosedState());
    }
}
