package behavioral_patterns.command.ex02;

/**
 * Command 인터페이스는 명령 패턴의 핵심 인터페이스입니다.
 * 모든 구체적인 명령 클래스는 이 인터페이스를 구현해야 합니다.
 */
public interface Command {
    /**
     * execute() 메서드는 명령을 실행하는 메서드입니다.
     * 각 구체적인 명령 클래스는 이 메서드를 구현하여 실제 동작을 정의합니다.
     */
    void execute();

    /**
     * undo() 메서드는 실행된 명령을 취소하고 이전 상태로 되돌리는 메서드입니다.
     * 각 구체적인 명령 클래스는 execute()에 대응되는 취소 동작을 구현해야 합니다.
     */
    void undo();
}
