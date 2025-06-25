package behavioral_patterns.command.ex01;

/**
 * 리모컨(RemoteControl) 클래스
 * 명령을 실행하는 Invoker 역할입니다.
 */
public class RemoteControl {
    /**
     * 현재 설정된 명령을 저장하는 필드입니다.
     */
    private Command command;

    /**
     * 명령을 설정하는 메서드입니다.
     * @param command 실행할 명령 객체
     */
    public void setCommand(Command command) {
        // 전달받은 명령 객체를 필드에 저장합니다.
        this.command = command;
    }

    /**
     * 버튼을 눌렀을 때 명령을 실행하는 메서드입니다.
     * 현재 설정된 명령의 execute()를 호출합니다.
     */
    public void pressButton() {
        // 현재 설정된 명령이 있으면 실행합니다.
        command.execute();
    }
}
