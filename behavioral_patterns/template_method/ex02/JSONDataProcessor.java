package behavioral_patterns.template_method.ex02;

/**
 * JSON 데이터 처리 클래스입니다.
 * <p>
 * DataProcessor 추상 클래스를 상속하여,
 * JSON 파일에 특화된 데이터 처리 과정을 구현합니다.
 */
public class JSONDataProcessor extends DataProcessor {
    /**
     * JSON 파일에서 데이터를 로드합니다.
     * @param data 파일명 또는 데이터 문자열
     */
    @Override
    protected void loadData(String data) {
        // JSON 파일에서 데이터 로드(예시)
        System.out.println("Loading data from JSON file: " + data);
    }

    /**
     * 데이터가 JSON 형식인지 유효성 검사합니다.
     * @param data 파일명 또는 데이터 문자열
     * @return JSON이라는 문자열이 포함되어 있으면 true
     */
    @Override
    protected boolean isValidData(String data) {
        // 데이터에 "JSON"이 포함되어 있으면 유효하다고 판단
        return data != null && data.contains("JSON");
    }

    /**
     * JSON 데이터를 처리합니다.
     * @param data 파일명 또는 데이터 문자열
     */
    @Override
    protected void processData(String data) {
        // JSON 데이터 처리(예시)
        System.out.println("Processing JSON data");
    }

    /**
     * 처리된 JSON 데이터를 데이터베이스에 저장합니다.
     * @param data 파일명 또는 데이터 문자열
     */
    @Override
    protected void saveData(String data) {
        // 데이터 저장(예시)
        System.out.println("Saving JSON data to database");
    }
}
