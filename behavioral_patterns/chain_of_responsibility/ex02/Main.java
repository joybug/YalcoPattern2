package behavioral_patterns.chain_of_responsibility.ex02;

/**
 * 체인 오브 리스폰서빌리티 패턴(로그 처리) 예제의 메인 클래스
 */
public class Main {
    /**
     * Logger 체인을 생성하는 메서드
     * @return Logger 체인의 시작점
     */
    private static Logger getChainOfLoggers() {
        // WARN 레벨: 네트워크로 전송
        Logger networkLogger = new NetworkLogger(LogLevel.WARN);
        // DEBUG 레벨: 파일로 저장
        Logger fileLogger = new FileLogger(LogLevel.DEBUG);
        // INFO 레벨: 콘솔에 출력
        Logger consoleLogger = new ConsoleLogger(LogLevel.INFO);

        // 체인 연결: 네트워크 → 파일 → 콘솔
        networkLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return networkLogger;
    }

    /**
     * 프로그램의 시작점(main 메서드)
     * @param args 커맨드라인 인자
     */
    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        // INFO 레벨 메시지: 콘솔에만 출력
        loggerChain.logMessage(LogLevel.INFO, 
            "This is an information.");
        
        // DEBUG 레벨 메시지: 파일, 콘솔에 출력
        loggerChain.logMessage(LogLevel.DEBUG,
            "This is a debug level information.");
        
        // WARN 레벨 메시지: 네트워크, 파일, 콘솔에 모두 출력
        loggerChain.logMessage(LogLevel.WARN,
            "This is a warning information.");
    }
}
