package structural_patterns.facade.ex01;

// Main 클래스는 SmartHomeFacade를 이용해 스마트홈을 제어하는 예제입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 각 장치 객체를 생성합니다.
        Thermostat thermostat = new Thermostat();
        Lights lights = new Lights();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // 퍼사드 객체를 생성하여 장치들을 한 번에 제어합니다.
        SmartHomeFacade smartHome
         = new SmartHomeFacade(thermostat, lights, coffeeMaker);

        // 아침에 일어날 때 동작을 실행합니다.
        smartHome.wakeUp();
        // 집을 나갈 때 동작을 실행합니다.
        smartHome.leaveHome();
    }
}
