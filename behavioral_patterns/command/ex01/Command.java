package behavioral_patterns.command.ex01;

/**
 * 명령(Command) 인터페이스
 * 실행할 명령의 공통 메서드를 정의합니다.
 *
 * <p>이 인터페이스를 구현하는 클래스는 실제로 어떤 동작을 할지 결정합니다.</p>
 */
public interface Command {
    /**
     * 명령을 실행하는 메서드입니다.
     * 구현 클래스에서 구체적인 동작을 정의합니다.
     */
    void execute();
}
