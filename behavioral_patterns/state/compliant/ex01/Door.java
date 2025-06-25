package behavioral_patterns.state.compliant.ex01;

/**
 * Door 클래스는 상태(State) 객체에 동작을 위임합니다.
 */
public class Door {
    private State state;
    public Door() {
        this.state = new ClosedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void open() {
        state.open(this);
    }
    public void close() {
        state.close(this);
    }
}
