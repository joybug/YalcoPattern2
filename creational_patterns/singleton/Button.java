package singleton;

/**
 * Button 클래스 - 버튼을 표현하는 UI 컴포넌트
 * 현재 테마에 맞춰 버튼을 표시
 */
public class Button {
    // 버튼에 표시할 레이블 텍스트
    private String label;

    /**
     * Button 생성자
     * @param label 버튼에 표시할 레이블 텍스트
     */
    public Button(String label) {
        this.label = label;
    }

    /**
     * 버튼을 현재 테마 색상으로 화면에 표시
     * 싱글톤 Theme 인스턴스로부터 현재 테마 색상을 가져와 사용
     */
    public void display() {
        // 싱글톤 패턴을 통해 현재 테마 색상 가져오기
        String themeColor = Theme.getInstance().getThemeColor();
        // 버튼의 표시 상태를 콘솔에 출력
        System.out.println(
            "Button [" + label + "] displayed in " + themeColor + " theme."
        );
    }
}
