package structural_patterns.bridge.ex01;

// Main 클래스는 브리지 패턴을 이용한 리모컨-기기 조합을 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // TV와 기본 리모컨을 조합하여 사용합니다.
        Device tv = new TV();
        Remote basicRemote = new BasicRemote(tv);
        basicRemote.power();
        basicRemote.volumeUp();
        
        System.out.println();

        // 라디오와 고급 리모컨을 조합하여 사용합니다.
        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.mute();
    }
}
