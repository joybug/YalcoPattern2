package behavioral_patterns.template_method.ex02;

/**
 * 템플릿 메서드 패턴 데이터 처리 예제의 메인 클래스
 */
public class Main {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process("CSV data");

        System.out.println();

        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process("XML data");
    }
}
