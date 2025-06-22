package solid_principles.open_closed.compliant;

/**
 * HTML 형식의 리포트를 생성하는 구현 클래스
 * Report 인터페이스 구현
 */
public class HTMLReport implements Report {
    /**
     * HTML 형식으로 리포트를 생성하는 메소드
     */
    @Override
    public void generate() {
        // HTML 문서 생성 로직
        System.out.println("Generating HTML report...");
    }
}
