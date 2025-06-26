package behavioral_patterns.state.compliant.ex02;

/**
 * 상태 패턴(State Pattern)을 적용한 VideoPlayer 예제의 메인 클래스입니다.
 * <p>
 * VideoPlayer 객체를 생성하고, play(), stop() 메서드를 여러 번 호출하여
 * 상태 변화에 따라 동작이 달라지는 것을 확인할 수 있습니다.
 */
public class Main {
    /**
     * 프로그램의 시작점(main 메서드)
     * <p>
     * VideoPlayer 객체를 생성하고, 여러 번 play/stop을 호출하여
     * 상태 변화에 따른 동작을 출력합니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // VideoPlayer 객체 생성(초기 상태: 정지)
        VideoPlayer player = new VideoPlayer();

        // 상태 변화에 따른 동작 테스트
        player.play();   // "Starting the video."
        player.play();   // "Video is already playing."
        player.stop();   // "Pausing the video."
        player.play();   // "Resuming the video."
        player.stop();   // "Pausing the video."
        player.stop();   // "Stopping the video."
        player.stop();   // "Video is already stopped."
    }
}
