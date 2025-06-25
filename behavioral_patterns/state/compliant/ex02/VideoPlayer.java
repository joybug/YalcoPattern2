package behavioral_patterns.state.compliant.ex02;

/**
 * VideoPlayer 클래스는 상태(State) 객체에 동작을 위임합니다.
 */
public class VideoPlayer {
    private State state;

    public VideoPlayer() {
        // Set initial state Stopped
        this.state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }
}
