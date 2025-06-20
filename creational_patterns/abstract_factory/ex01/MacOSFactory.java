package abstract_factory.ex01;

/**
 * Concrete Factory - MacOS 스타일
 * - MacOS 스타일의 GUI 컴포넌트들을 생성하는 구체 팩토리
 */
public class MacOSFactory implements GUIFactory {
    /**
     * MacOS 스타일의 버튼 객체를 생성
     * @Override GUIFactory 인터페이스의 createButton 메서드
     * @return MacOS 스타일의 버튼 인스턴스
     */
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    /**
     * MacOS 스타일의 체크박스 객체를 생성
     * @Override GUIFactory 인터페이스의 createCheckbox 메서드
     * @return MacOS 스타일의 체크박스 인스턴스
     */
    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
