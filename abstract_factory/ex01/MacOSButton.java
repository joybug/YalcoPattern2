package abstract_factory.ex01;

/**
 * Concrete Product - MacOS 버튼
 * - MacOS 스타일의 버튼 구현체
 */
public class MacOSButton implements Button {
    /**
     * MacOS 스타일로 버튼을 렌더링
     * @Override Button 인터페이스의 paint 메서드
     */
    @Override
    public void paint() {
        System.out.println("Rendering a button in MacOS style");
    }
}
