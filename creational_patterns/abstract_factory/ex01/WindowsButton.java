package abstract_factory.ex01;

/**
 * WindowsButton 클래스 - Windows 스타일 버튼 구현
 * 
 * 역할:
 * - Windows 운영체제의 스타일에 맞는 버튼을 구현
 * - Button 인터페이스를 구체적으로 구현하는 클래스
 * 
 * 특징:
 * - Windows의 디자인 가이드라인을 따르는 버튼 스타일 제공
 */
public class WindowsButton implements Button {
    /**
     * Windows 스타일로 버튼을 화면에 그리는 메서드
     * 
     * @Override Button 인터페이스의 paint 메서드를 구현
     * 
     * 동작:
     * - Windows UI 가이드라인에 맞는 스타일로 버튼을 렌더링
     * - 실제 애플리케이션에서는 Windows API를 호출하여 버튼을 그림
     */
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style");
    }
}
