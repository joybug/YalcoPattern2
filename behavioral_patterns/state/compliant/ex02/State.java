package behavioral_patterns.state.compliant.ex02;

/**
 * State 인터페이스는 VideoPlayer의 상태별 동작(play, stop)을 정의합니다.
 * <p>
 * 상태 패턴에서 각 상태(재생, 일시정지, 정지)에 따라 동작이 다르게 구현됩니다.
 */
public interface State {
    /**
     * 비디오를 재생하는 동작을 수행합니다.
     * @param player 상태가 변경될 VideoPlayer 객체
     */
    void play(VideoPlayer player);

    /**
     * 비디오를 정지(또는 일시정지)하는 동작을 수행합니다.
     * @param player 상태가 변경될 VideoPlayer 객체
     */
    void stop(VideoPlayer player);
}
