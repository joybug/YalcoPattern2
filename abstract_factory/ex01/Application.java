package abstract_factory.ex01;

/**
 * Application 클래스 - 클라이언트(사용자) 코드
 * 
 * 역할:
 * - GUI 컴포넌트(버튼, 체크박스)를 생성하고 관리
 * - 추상 팩토리를 통해 운영체제에 맞는 컴포넌트들을 생성
 * 
 * 동작 방식:
 * 1. 생성자에서 팩토리를 통해 컴포넌트들을 초기화
 * 2. paint() 메서드로 컴포넌트들을 화면에 표시
 */
public class Application {
    private Button button;      // GUI 버튼
    private Checkbox checkbox;  // GUI 체크박스

    /**
     * Application 생성자
     * - GUI 컴포넌트들을 초기화하는 역할
     * 
     * 동작 과정:
     * 1. 팩토리를 통해 버튼 생성
     * 2. 팩토리를 통해 체크박스 생성
     * 
     * @param factory Windows 또는 MacOS의 GUI 컴포넌트를 생성하는 팩토리
     */
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    /**
     * GUI 컴포넌트 렌더링 메서드
     * - 생성된 버튼과 체크박스를 화면에 표시
     * 
     * 동작 과정:
     * 1. 버튼을 화면에 그림
     * 2. 체크박스를 화면에 그림
     */
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
