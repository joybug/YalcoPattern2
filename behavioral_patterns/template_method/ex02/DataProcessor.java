package behavioral_patterns.template_method.ex02;

/**
 * 데이터 처리 템플릿 메서드 패턴의 추상 클래스
 */
public abstract class DataProcessor {
    // 템플릿 메서드
    public final void process(String data) {
        loadData(data);
        if (isValidData(data)) {
            processData(data);
            saveData(data);
        } else {
            System.out.println("Data is invalid, processing aborted.");
        }
    }

    protected abstract void loadData(String data);
    protected abstract boolean isValidData(String data);
    protected abstract void processData(String data);
    protected abstract void saveData(String data);
}
