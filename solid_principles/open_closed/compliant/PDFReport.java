package solid_principles.open_closed.compliant;

/**
 * PDF 형식의 리포트를 생성하는 구현 클래스
 */
public class PDFReport implements Report {
    /**
     * PDF 형식으로 리포트를 생성하는 메소드
     */
    @Override
    public void generate() {
        // PDF 문서 생성 로직
        System.out.println("Generating PDF report...");
    }
}
