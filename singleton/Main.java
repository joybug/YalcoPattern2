package singleton;

/**
 * Main 클래스 - 싱글톤 패턴을 사용하는 UI 컴포넌트들의 테스트
 * 테마 변경에 따른 각 컴포넌트들의 표시 변화를 시연
 */
public class Main {
    /**
     * 프로그램의 진입점
     * 여러 UI 컴포넌트를 생성하고 테마 변경에 따른 동작을 테스트
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // UI 컴포넌트들을 생성
        Button button = new Button("Submit");
        TextField textField = new TextField("Enter your name");
        Label label = new Label("Username");

        // 기본 테마(light)로 각 컴포넌트 표시
        button.display();
        textField.display();
        label.display();

        // 테마를 dark로 변경
        Theme.getInstance().setThemeColor("dark");

        // 변경된 테마(dark)로 각 컴포넌트 다시 표시
        button.display();
        textField.display();
        label.display();
    }
}
