package singleton;

/**
 * TextField 클래스 - 텍스트 입력 필드를 표현하는 UI 컴포넌트
 * 현재 테마에 맞춰 텍스트 필드를 표시
 */
public class TextField {
    // 텍스트 필드에 표시할 텍스트
    private String text;

    /**
     * TextField 생성자
     * @param text 텍스트 필드에 표시할 초기 텍스트
     */
    public TextField(String text) {
        this.text = text;
    }

    /**
     * 텍스트 필드를 현재 테마 색상으로 화면에 표시
     * 싱글톤 Theme 인스턴스로부터 현재 테마 색상을 가져와 사용
     */
    public void display() {
        // 싱글톤 패턴을 통해 현재 테마 색상 가져오기
        String themeColor = Theme.getInstance().getThemeColor();
        // 텍스트 필드의 표시 상태를 콘솔에 출력
        System.out.println(
            "TextField [" + text + "] displayed in " + themeColor + " theme."
        );
    }
}
