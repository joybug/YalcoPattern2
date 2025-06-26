package behavioral_patterns.state.compliant.ex02;

/**
 * PlayingState 클래스는 재생 중 상태에서의 동작을 정의합니다.
 * <p>
 * 이미 재생 중일 때 play()를 호출하면 안내 메시지를 출력하고,
 * stop()을 호출하면 일시정지 상태로 전환합니다.
 */
public class PlayingState implements State {
    /**
     * 이미 재생 중이므로 추가로 재생할 수 없다는 메시지를 출력합니다.
     * @param player VideoPlayer 객체
     */
    @Override
    public void play(VideoPlayer player) {
        // 이미 재생 중임을 안내
        System.out.println("Video is already playing.");
    }

    /**
     * 비디오를 일시정지 상태로 전환합니다.
     * @param player VideoPlayer 객체
     */
    @Override
    public void stop(VideoPlayer player) {
        // 상태를 PausedState로 변경
        System.out.println("Pausing the video.");
        player.setState(new PausedState());
    }
}
