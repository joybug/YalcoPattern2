package abstract_factory.ex01;

/**
 * Concrete Factory - Windows 스타일
 * - Windows 스타일의 GUI 컴포넌트들을 생성하는 구체 팩토리
 */
public class WindowsFactory implements GUIFactory {
    /**
     * Windows 스타일의 버튼 객체를 생성
     * @Override GUIFactory 인터페이스의 createButton 메서드
     * @return Windows 스타일의 버튼 인스턴스
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    /**
     * Windows 스타일의 체크박스 객체를 생성
     * @Override GUIFactory 인터페이스의 createCheckbox 메서드
     * @return Windows 스타일의 체크박스 인스턴스
     */
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
