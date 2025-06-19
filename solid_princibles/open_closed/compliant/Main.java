package solid_princibles.open_closed.compliant;

/**
 * 개방-폐쇄 원칙(OCP)을 준수하는 리포트 생성 시스템의 실행 클래스
 * 다양한 형식의 리포트 생성을 테스트
 */
public class Main {
    /**
     * 프로그램의 진입점
     * 서로 다른 형식의 리포트를 생성하여 테스트
     * @param args 명령행 인자
     */
    public static void main(String[] args) {
        // PDF 리포트 생성 테스트
        Report pdfReport = new PDFReport();
        pdfReport.generate();  // Generating PDF report...

        // HTML 리포트 생성 테스트
        Report htmlReport = new HTMLReport();
        htmlReport.generate();  // Generating HTML report...

        // XML 리포트 생성 테스트
        Report xmlReport = new XMLReport();
        xmlReport.generate();  // Generating XML report...
    }
}