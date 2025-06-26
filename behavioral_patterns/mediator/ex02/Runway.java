package behavioral_patterns.mediator.ex02;

/**
 * Runway 클래스는 활주로를 나타내며, 관제탑을 통해 상태를 변경합니다.
 */
class Runway {
    /**
     * 활주로가 소속된 관제탑(중재자) 객체입니다.
     */
    private AirportMediator mediator;

    /**
     * Runway 객체를 생성합니다.
     * @param mediator 관제탑(중재자) 객체
     */
    public Runway(AirportMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 활주로를 비움(사용 가능 상태로 변경)
     * 관제탑에 상태 변경을 알립니다.
     */
    public void clear() {
        System.out.println("Runway is clear.");
        mediator.setRunwayAvailability(true);
    }
}
