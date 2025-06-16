package abstract_factory.ex01;

/**
 * Client
 * - 추상 팩토리와 추상 제품을 사용하는 클라이언트 코드
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    /**
     * 애플리케이션 생성자
     * @param factory GUI 컴포넌트를 생성할 팩토리 인스턴스
     */
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    /**
     * GUI 컴포넌트 렌더링 메서드
     * - 생성된 버튼과 체크박스를 화면에 그림
     */
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
