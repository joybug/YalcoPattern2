package behavioral_patterns.chain_of_responsibility.ex02;

/**
 * 파일에 로그를 출력하는 Logger 구현 클래스(실제 예제에서는 콘솔에 출력)
 */
public class FileLogger extends Logger {
    /**
     * 생성자: 처리할 로그 레벨을 지정합니다.
     * @param level 로그 레벨
     */
    public FileLogger(LogLevel level) {
        // 부모의 level 필드에 값 할당
        this.level = level;
    }

    /**
     * 실제로 파일(여기서는 콘솔)에 로그 메시지를 출력합니다.
     * @param message 출력할 메시지
     */
    @Override
    protected void write(String message) {
        // 파일 대신 콘솔에 메시지 출력
        System.out.println("File::Logger: " + message);
    }
}
