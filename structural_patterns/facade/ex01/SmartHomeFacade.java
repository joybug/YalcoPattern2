package structural_patterns.facade.ex01;

// SmartHomeFacade 클래스는 여러 스마트홈 장치를 간단하게 제어할 수 있는 퍼사드 역할을 합니다.
public class SmartHomeFacade {
    // 내부적으로 사용할 장치들을 참조합니다.
    private Thermostat thermostat;
    private Lights lights;
    private CoffeeMaker coffeeMaker;

    // 생성자: 각 장치 객체를 받아 저장합니다.
    public SmartHomeFacade(
        Thermostat thermostat, Lights lights, CoffeeMaker coffeeMaker
    ) {
        this.thermostat = thermostat;
        this.lights = lights;
        this.coffeeMaker = coffeeMaker;
    }

    // 아침에 일어날 때 필요한 동작을 한 번에 수행하는 메소드입니다.
    public void wakeUp() {
        System.out.println("Waking up...");
        thermostat.setTemperature(22);
        lights.on();
        coffeeMaker.brewCoffee();
    }

    // 집을 나갈 때 필요한 동작을 한 번에 수행하는 메소드입니다.
    public void leaveHome() {
        System.out.println("Leaving home...");
        thermostat.setTemperature(18);
        lights.off();
    }
}
