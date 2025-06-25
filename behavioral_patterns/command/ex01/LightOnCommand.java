package behavioral_patterns.command.ex01;

/**
 * 전등을 켜는 명령을 나타내는 클래스
 * Command 인터페이스를 구현합니다.
 */
public class LightOnCommand implements Command {
    /**
     * 실제 동작을 수행할 Light 객체를 참조합니다.
     */
    private Light light;

    /**
     * 생성자에서 Light 객체를 받아서 저장합니다.
     * @param light 명령을 수행할 전등 객체
     */
    public LightOnCommand(Light light) {
        // 전달받은 Light 객체를 멤버 변수에 저장
        this.light = light;
    }

    /**
     * execute() 메서드는 전등을 켜는 명령을 실행합니다.
     * 내부적으로 Light 객체의 turnOn()을 호출합니다.
     */
    @Override
    public void execute() {
        // 전등을 켜는 동작 위임
        light.turnOn();
    }
}
