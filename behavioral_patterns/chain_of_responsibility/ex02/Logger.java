package behavioral_patterns.chain_of_responsibility.ex02;

/**
 * Logger 추상 클래스
 * 각 로그 처리 객체의 공통 기능을 정의합니다.
 */
public abstract class Logger {
    /**
     * 이 Logger가 처리할 로그 레벨
     */
    protected LogLevel level;
    /**
     * 다음 Logger를 가리키는 참조 변수
     */
    protected Logger nextLogger;

    /**
     * 다음 Logger를 설정하는 메서드
     * @param nextLogger 다음 Logger 객체
     */
    public void setNextLogger(Logger nextLogger) {
        // 다음 Logger를 연결합니다.
        this.nextLogger = nextLogger;
    }

    /**
     * 로그 메시지를 처리하는 메서드
     * @param level 로그 레벨
     * @param message 로그 메시지
     */
    public void logMessage(LogLevel level, String message) {
        // 현재 Logger가 처리할 수 있는 레벨이면 메시지 출력
        if (this.level.ordinal() <= level.ordinal()) {
            write(message);
        }
        // 다음 Logger가 있으면 체인을 따라 요청을 전달
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 실제 로그 출력을 담당하는 추상 메서드
     * 하위 클래스에서 구체적으로 구현합니다.
     */
    protected abstract void write(String message);
}
