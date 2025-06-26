package behavioral_patterns.state.compliant.ex02;

/**
 * StoppedState 클래스는 정지 상태에서의 동작을 정의합니다.
 * <p>
 * play()를 호출하면 재생 상태로, stop()을 호출하면 이미 정지 상태임을 안내합니다.
 */
public class StoppedState implements State {
    /**
     * 비디오를 재생 상태로 전환합니다.
     * @param player VideoPlayer 객체
     */
    @Override
    public void play(VideoPlayer player) {
        // 상태를 PlayingState로 변경
        System.out.println("Starting the video.");
        player.setState(new PlayingState());
    }

    /**
     * 이미 정지 상태임을 안내합니다.
     * @param player VideoPlayer 객체
     */
    @Override
    public void stop(VideoPlayer player) {
        // 이미 정지 상태임을 안내
        System.out.println("Video is already stopped.");
    }
}
