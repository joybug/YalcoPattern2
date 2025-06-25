package behavioral_patterns.state.compliant.ex02;

/**
 * State 인터페이스는 VideoPlayer의 상태별 동작을 정의합니다.
 */
public interface State {
    void play(VideoPlayer player);
    void stop(VideoPlayer player);
}
