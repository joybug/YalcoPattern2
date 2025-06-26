package behavioral_patterns.state.noncompliant;

/**
 * VideoPlayer 클래스는 상태(State) 패턴을 적용하지 않은 비권장 예시입니다.
 * <p>
 * 내부적으로 문자열(String)로 상태를 관리하며,
 * 상태별 동작을 조건문(if-else)으로 처리합니다.
 * <br>
 * 이 방식은 상태가 늘어나거나 복잡해질수록 코드가 길어지고 유지보수가 어려워집니다.
 */
public class VideoPlayer {
    /**
     * 현재 VideoPlayer의 상태를 문자열로 저장합니다.
     * 예: "Stopped", "Playing", "Paused"
     */
    private String state;

    /**
     * VideoPlayer의 생성자입니다.
     * 초기 상태는 "Stopped"로 설정됩니다.
     */
    public VideoPlayer() {
        // 처음 생성 시 정지 상태로 시작
        this.state = "Stopped";
    }

    /**
     * 비디오 재생 동작을 수행합니다.
     * 상태에 따라 동작이 달라집니다.
     * "Stopped" → "Playing"으로 전환, "Playing"이면 안내, "Paused"면 재생
     */
    public void play() {
        if (state.equals("Stopped")) {
            // 정지 상태에서 재생 시작
            System.out.println("Starting the video.");
            state = "Playing";
        } else if (state.equals("Playing")) {
            // 이미 재생 중임을 안내
            System.out.println("Video is already playing.");
        } else if (state.equals("Paused")) {
            // 일시정지 상태에서 재생 재개
            System.out.println("Resuming the video.");
            state = "Playing";
        }
    }

    /**
     * 비디오 정지(또는 일시정지) 동작을 수행합니다.
     * 상태에 따라 동작이 달라집니다.
     * "Playing" → "Paused", "Paused" → "Stopped", "Stopped"면 안내
     */
    public void stop() {
        if (state.equals("Playing")) {
            // 재생 중이면 일시정지로 전환
            System.out.println("Pausing the video.");
            state = "Paused";
        } else if (state.equals("Paused")) {
            // 일시정지 상태에서 정지로 전환
            System.out.println("Stopping the video.");
            state = "Stopped";
        } else if (state.equals("Stopped")) {
            // 이미 정지 상태임을 안내
            System.out.println("Video is already stopped.");
        }
    }

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
