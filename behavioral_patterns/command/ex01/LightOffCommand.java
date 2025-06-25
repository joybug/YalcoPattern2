package behavioral_patterns.command.ex01;

/**
 * 전등을 끄는 명령을 나타내는 클래스
 * Command 인터페이스를 구현합니다.
 */
public class LightOffCommand implements Command {
    /**
     * 전등 객체를 저장할 필드입니다.
     */
    private Light light;

    /**
     * 생성자: 끌 전등 객체를 받아서 필드에 저장합니다.
     * @param light 명령을 수행할 전등(수신자)
     */
    public LightOffCommand(Light light) {
        // 전달받은 전등 객체를 필드에 저장합니다.
        this.light = light;
    }

    /**
     * execute 메서드는 실제로 전등을 끄는 명령을 수행합니다.
     * Command 인터페이스의 메서드를 구현한 것으로, 호출 시 수신자의 turnOff()를 실행합니다.
     */
    @Override
    public void execute() {
        // 전등을 끄는 동작을 수행합니다.
        light.turnOff();
    }
}
