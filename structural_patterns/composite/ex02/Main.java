package structural_patterns.composite.ex02;

// Main 클래스는 UI 컴포지트 구조를 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 버튼, 텍스트박스 등 기본 UI 컴포넌트를 생성합니다.
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");
        TextBox usernameField = new TextBox("Username");

        // Panel에 컴포넌트들을 추가합니다.
        Panel formPanel = new Panel("Form");
        formPanel.add(submitButton);
        formPanel.add(cancelButton);
        formPanel.add(usernameField);

        // Window에 Panel을 추가합니다.
        Window mainWindow = new Window("Main");
        mainWindow.add(formPanel);
        mainWindow.render();

        System.out.println();

        // Cancel 버튼을 제거한 후 다시 렌더링합니다.
        formPanel.remove(cancelButton);
        mainWindow.render();
    }
}
