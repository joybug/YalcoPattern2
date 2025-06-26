package behavioral_patterns.state.compliant.ex01;

/**
 * 문(State) 인터페이스
 * <p>
 * 문이 가질 수 있는 상태(예: 열림, 닫힘)에 따라 동작이 달라지도록 하는 상태 패턴의 핵심 인터페이스입니다.
 * 각 상태별로 open(), close() 메서드의 동작이 다르게 구현됩니다.
 */
public interface State {
    /**
     * 문을 여는 동작을 수행합니다.
     * @param door 상태가 변경될 문 객체
     */
    void open(Door door);

    /**
     * 문을 닫는 동작을 수행합니다.
     * @param door 상태가 변경될 문 객체
     */
    void close(Door door);
}
