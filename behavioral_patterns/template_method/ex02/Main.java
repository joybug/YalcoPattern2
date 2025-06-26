package behavioral_patterns.template_method.ex02;

/**
 * 템플릿 메서드 패턴 데이터 처리 예제의 메인 클래스입니다.
 * <p>
 * DataProcessor 추상 클래스를 상속한 CSVDataProcessor, JSONDataProcessor 객체를 생성하여
 * process()를 호출하면, 각 데이터 형식별로 처리 과정이 다르게 동작함을 확인할 수 있습니다.
 */
public class Main {
    /**
     * 프로그램의 시작점(main 메서드)
     * <p>
     * CSV, JSON 데이터 처리 객체를 생성하고, process()를 호출하여
     * 템플릿 메서드 패턴의 동작을 확인합니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // CSV 데이터 처리 객체 생성 및 실행
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process("CSV data");

        System.out.println();

        // JSON 데이터 처리 객체 생성 및 실행(유효성 실패 예시)
        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process("XML data");
    }
}
