package singleton;

/**
 * Theme 클래스 - 싱글톤 패턴을 구현한 테마 관리 클래스
 * 애플리케이션 전체에서 단 하나의 테마 인스턴스만 존재하도록 보장
 */
public class Theme {
    // 싱글톤 인스턴스를 저장할 정적 변수
    private static Theme instance;
    // 현재 테마 색상을 저장하는 변수
    private String themeColor;

    /**
     * private 생성자로 외부에서 인스턴스 생성을 제한
     * 기본 테마 색상을 'light'로 초기화
     */
    private Theme() {
        this.themeColor = "light"; // 기본 테마 색상 설정
    }

    /**
     * 싱글톤 인스턴스를 반환하는 정적 메서드
     * @return Theme 클래스의 유일한 인스턴스
     */
    public static Theme getInstance() {
        if (instance == null) {
            // 인스턴스가 없는 경우에만 새로 생성
            instance = new Theme();
        }
        return instance;
    }

    /**
     * 현재 테마 색상을 반환
     * @return 현재 설정된 테마 색상
     */
    public String getThemeColor() {
        return themeColor;
    }

    /**
     * 테마 색상을 설정
     * @param themeColor 설정할 테마 색상
     */
    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }
}
