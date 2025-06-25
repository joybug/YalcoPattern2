package behavioral_patterns.mediator.ex02;

/**
 * Runway 클래스는 활주로를 나타내며, 관제탑을 통해 상태를 변경합니다.
 */
class Runway {
    private AirportMediator mediator;

    public Runway(AirportMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 활주로를 비움(사용 가능 상태로 변경)
     */
    public void clear() {
        System.out.println("Runway is clear.");
        mediator.setRunwayAvailability(true);
    }
}
