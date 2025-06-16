package abstract_factory.ex01;

/**
 * 실행 클래스
 * - Abstract Factory 패턴의 작동 테스트
 */
public class Main {
    /**
     * 메인 메서드
     * - Windows와 MacOS 스타일의 GUI를 생성하고 렌더링하는 테스트 실행
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // Create Windows GUI
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.paint();

        System.out.println();

        // Create MacOS GUI
        GUIFactory macFactory = new MacOSFactory();
        Application macApp = new Application(macFactory);
        macApp.paint();
    }
}
