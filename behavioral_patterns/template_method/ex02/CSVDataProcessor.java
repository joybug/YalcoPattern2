package behavioral_patterns.template_method.ex02;

/**
 * CSV 데이터 처리 클래스입니다.
 * <p>
 * DataProcessor 추상 클래스를 상속하여,
 * CSV 파일에 특화된 데이터 처리 과정을 구현합니다.
 */
public class CSVDataProcessor extends DataProcessor {
    /**
     * CSV 파일에서 데이터를 로드합니다.
     * @param data 파일명 또는 데이터 문자열
     */
    @Override
    protected void loadData(String data) {
        // CSV 파일에서 데이터 로드(예시)
        System.out.println("Loading data from CSV file: " + data);
    }

    /**
     * 데이터가 CSV 형식인지 유효성 검사합니다.
     * @param data 파일명 또는 데이터 문자열
     * @return CSV라는 문자열이 포함되어 있으면 true
     */
    @Override
    protected boolean isValidData(String data) {
        // 데이터에 "CSV"가 포함되어 있으면 유효하다고 판단
        return data != null && data.contains("CSV");
    }

    /**
     * CSV 데이터를 처리합니다.
     * @param data 파일명 또는 데이터 문자열
     */
    @Override
    protected void processData(String data) {
        // CSV 데이터 처리(예시)
        System.out.println("Processing CSV data");
    }

    /**
     * 처리된 CSV 데이터를 데이터베이스에 저장합니다.
     * @param data 파일명 또는 데이터 문자열
     */
    @Override
    protected void saveData(String data) {
        // 데이터 저장(예시)
        System.out.println("Saving CSV data to database");
    }
}
