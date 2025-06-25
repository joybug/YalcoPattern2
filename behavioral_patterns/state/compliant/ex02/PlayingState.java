package behavioral_patterns.state.compliant.ex02;

/**
 * PlayingState 클래스는 재생 중 상태에서의 동작을 정의합니다.
 */
public class PlayingState implements State {
    @Override
    public void play(VideoPlayer player) {
        System.out.println("Video is already playing.");
    }

    @Override
    public void stop(VideoPlayer player) {
        System.out.println("Pausing the video.");
        player.setState(new PausedState());
    }
}
