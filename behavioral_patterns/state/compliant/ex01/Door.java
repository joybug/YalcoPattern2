package behavioral_patterns.state.compliant.ex01;

/**
 * 문(Door) 클래스
 * <p>
 * 상태 패턴을 적용하여, 문이 열림(OpenState) 또는 닫힘(ClosedState) 상태에 따라 동작이 달라지도록 구현한 클래스입니다.
 */
public class Door {
    /**
     * 현재 문이 가지고 있는 상태(State)를 나타냅니다.
     */
    private State state;

    /**
     * Door의 생성자입니다.
     * 초기 상태는 닫힘(ClosedState)으로 설정됩니다.
     */
    public Door() {
        // 문이 처음 생성될 때는 닫혀 있는 상태로 시작
        this.state = new ClosedState();
    }

    /**
     * 문을 여는 동작을 수행합니다.
     * 현재 상태 객체의 open() 메서드를 호출합니다.
     */
    public void open() {
        // 현재 상태에 따라 open 동작 위임
        state.open(this);
    }

    /**
     * 문을 닫는 동작을 수행합니다.
     * 현재 상태 객체의 close() 메서드를 호출합니다.
     */
    public void close() {
        // 현재 상태에 따라 close 동작 위임
        state.close(this);
    }

    /**
     * 문 상태(State)를 변경합니다.
     * @param state 새로 설정할 상태 객체
     */
    public void setState(State state) {
        // 상태 변경
        this.state = state;
    }
}
