package behavioral_patterns.mediator.ex02;

/**
 * Flight 클래스는 비행기를 나타내며, 활주로 상태를 관제탑에 문의하여 착륙을 시도합니다.
 */
class Flight {
    /**
     * 비행기가 소속된 관제탑(중재자) 객체입니다.
     */
    private AirportMediator mediator;
    /**
     * 비행기 번호입니다.
     */
    private String flightNumber;

    /**
     * Flight 객체를 생성합니다.
     * @param mediator 관제탑(중재자) 객체
     * @param flightNumber 비행기 번호
     */
    public Flight(AirportMediator mediator, String flightNumber) {
        this.mediator = mediator;
        this.flightNumber = flightNumber;
    }

    /**
     * 비행기가 착륙을 시도합니다.
     * 활주로가 비어 있으면 착륙하고, 아니면 대기합니다.
     */
    public void land() {
        if (mediator.isRunwayAvailable()) {
            System.out.println("Flight " + flightNumber + " is landing.");
            mediator.setRunwayAvailability(false);
        } else {
            System.out.println("Flight " + flightNumber + " is waiting to land.");
        }
    }
}
