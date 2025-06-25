package behavioral_patterns.state.compliant.ex02;

/**
 * Main 클래스는 상태 패턴을 적용한 VideoPlayer 예제를 실행합니다.
 */
public class Main {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();
        
        player.play();   // "Starting the video."
        player.play();   // "Video is already playing."
        player.stop();   // "Pausing the video."
        player.play();   // "Resuming the video."
        player.stop();   // "Pausing the video."
        player.stop();   // "Stopping the video."
        player.stop();   // "Video is already stopped."
    }
}
