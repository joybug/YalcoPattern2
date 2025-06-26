package behavioral_patterns.command.ex01;

/**
 * 명령 패턴(Command Pattern) 예제의 메인 클래스
 * <p>전등(Light), 명령(Command), 리모컨(RemoteControl)을 생성하고 동작을 테스트합니다.</p>
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * 명령 객체와 리모컨을 생성하고, 명령을 설정한 뒤 버튼을 눌러 동작을 확인합니다.
     * @param args 커맨드라인 인자
     */
    public static void main(String[] args) {
        // 전등(수신자) 객체 생성
        Light livingRoomLight = new Light();
        
        // 전등을 켜는 명령 객체 생성 (수신자 전달)
        Command lightOn = new LightOnCommand(livingRoomLight);
        
        // 전등을 끄는 명령 객체 생성 (수신자 전달)
        Command lightOff = new LightOffCommand(livingRoomLight);
        
        // 리모컨(Invoker) 객체 생성
        RemoteControl remote = new RemoteControl();
        
        // 리모컨에 전등 켜기 명령 설정 후 버튼 누르기
        remote.setCommand(lightOn); // lightOn 명령을 리모컨에 설정
        remote.pressButton(); // "Light is ON" 출력
        
        // 리모컨에 전등 끄기 명령 설정 후 버튼 누르기
        remote.setCommand(lightOff); // lightOff 명령을 리모컨에 설정
        remote.pressButton(); // "Light is OFF" 출력
    }
}
