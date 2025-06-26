package behavioral_patterns.template_method.ex02;

/**
 * 데이터 처리 템플릿 메서드 패턴의 추상 클래스입니다.
 * <p>
 * process() 메서드가 전체 처리 과정을 정의하고,
 * loadData, isValidData, processData, saveData는 하위 클래스에서 구체적으로 구현합니다.
 */
public abstract class DataProcessor {
    /**
     * 템플릿 메서드: 데이터 처리 전체 과정을 순서대로 실행합니다.
     * 하위 클래스에서 오버라이드하지 못하도록 final로 선언합니다.
     * @param data 처리할 데이터(파일명 또는 데이터 문자열)
     */
    public final void process(String data) {
        // 1. 데이터 로드
        loadData(data);
        // 2. 데이터 유효성 검사
        if (isValidData(data)) {
            // 3. 데이터 처리
            processData(data);
            // 4. 데이터 저장
            saveData(data);
        } else {
            // 유효하지 않은 경우 안내 메시지 출력
            System.out.println("Data is invalid, processing aborted.");
        }
    }

    /**
     * 데이터 로드(하위 클래스에서 구현)
     */
    protected abstract void loadData(String data);
    /**
     * 데이터 유효성 검사(하위 클래스에서 구현)
     */
    protected abstract boolean isValidData(String data);
    /**
     * 데이터 처리(하위 클래스에서 구현)
     */
    protected abstract void processData(String data);
    /**
     * 데이터 저장(하위 클래스에서 구현)
     */
    protected abstract void saveData(String data);
}
