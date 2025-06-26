package behavioral_patterns.state.compliant.ex02;

/**
 * VideoPlayer 클래스는 상태(State) 객체에 동작을 위임하여
 * 상태에 따라 play(), stop()의 동작이 달라지도록 구현한 예제입니다.
 */
public class VideoPlayer {
    /**
     * 현재 VideoPlayer가 가지고 있는 상태(State)를 나타냅니다.
     */
    private State state;

    /**
     * VideoPlayer의 생성자입니다.
     * 초기 상태는 정지(StoppedState)로 설정됩니다.
     */
    public VideoPlayer() {
        // 처음 생성 시 정지 상태로 시작
        this.state = new StoppedState();
    }

    /**
     * 상태(State) 객체를 변경합니다.
     * @param state 새로 설정할 상태 객체
     */
    public void setState(State state) {
        // 상태 변경
        this.state = state;
    }

    /**
     * 비디오 재생 동작을 수행합니다.
     * 현재 상태 객체의 play() 메서드를 호출합니다.
     */
    public void play() {
        // 현재 상태에 따라 play 동작 위임
        state.play(this);
    }

    /**
     * 비디오 정지(또는 일시정지) 동작을 수행합니다.
     * 현재 상태 객체의 stop() 메서드를 호출합니다.
     */
    public void stop() {
        // 현재 상태에 따라 stop 동작 위임
        state.stop(this);
    }
}
