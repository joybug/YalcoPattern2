package behavioral_patterns.state.compliant.ex01;

/**
 * State 인터페이스는 문(Door)의 상태별 동작을 정의합니다.
 */
public interface State {
    void open(Door door);
    void close(Door door);
}
