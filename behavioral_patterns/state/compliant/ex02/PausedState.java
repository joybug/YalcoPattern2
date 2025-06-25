package behavioral_patterns.state.compliant.ex02;

/**
 * PausedState 클래스는 일시정지 상태에서의 동작을 정의합니다.
 */
public class PausedState implements State {
    @Override
    public void play(VideoPlayer player) {
        System.out.println("Resuming the video.");
        player.setState(new PlayingState());
    }

    @Override
    public void stop(VideoPlayer player) {
        System.out.println("Stopping the video.");
        player.setState(new StoppedState());
    }
}
