package solid_princibles.open_closed.noncompliant;

/**
 * 리포트 생성을 담당하는 클래스
 * OCP(Open-Closed Principle) 원칙을 위반하는 예제
 * 새로운 리포트 형식이 추가될 때마다 클래스를 수정해야 함
 */
public class ReportGenerator {
    /**
     * 지정된 타입의 리포트를 생성하는 메서드
     * OCP 위반: 새로운 형식이 추가될 때마다 메서드를 수정해야 함
     * 
     * @param type 생성할 리포트의 타입 ("PDF" 또는 "HTML")
     */
    public void generateReport(String type) {
        // if-else 구문을 사용한 타입 체크는 OCP 위반의 전형적인 예
        if (type.equals("PDF")) {
            // PDF 형식의 리포트 생성 로직
            System.out.println("Generating PDF report...");
        } else if (type.equals("HTML")) {
            // HTML 형식의 리포트 생성 로직
            System.out.println("Generating HTML report...");
        }
        // 새로운 형식(예: Excel, Word 등)을 추가하려면
        // 이 메서드를 수정해야 하므로 OCP 위반
    }
}
