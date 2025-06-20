package abstract_factory.ex01;

/**
 * Concrete Product - Windows 체크박스
 * - Windows 스타일의 체크박스 구현체
 */
public class WindowsCheckbox implements Checkbox {
    /**
     * Windows 스타일로 체크박스를 렌더링
     * @Override Checkbox 인터페이스의 paint 메서드
     */
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style");
    }
}
