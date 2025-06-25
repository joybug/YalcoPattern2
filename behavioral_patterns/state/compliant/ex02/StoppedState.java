package behavioral_patterns.state.compliant.ex02;

/**
 * StoppedState 클래스는 정지 상태에서의 동작을 정의합니다.
 */
public class StoppedState implements State {
    @Override
    public void play(VideoPlayer player) {
        System.out.println("Starting the video.");
        player.setState(new PlayingState());
    }

    @Override
    public void stop(VideoPlayer player) {
        System.out.println("Video is already stopped.");
    }
}
