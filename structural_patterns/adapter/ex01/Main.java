package structural_patterns.adapter.ex01;

// Main 클래스는 어댑터 패턴을 이용한 메시지 전송을 테스트하는 실행 진입점입니다.
class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 예전 메시지 시스템 객체를 생성합니다.
        OldMessageSender oldSystem = new OldMessageSystem();
        // 어댑터를 통해 예전 시스템을 최신 인터페이스로 감쌉니다.
        ModernMessageSender adapter = new MessageAdapter(oldSystem);

        // 최신 인터페이스로 메시지를 전송합니다.
        adapter.sendMessage("Hello, World!", "john@example.com");
    }
}
