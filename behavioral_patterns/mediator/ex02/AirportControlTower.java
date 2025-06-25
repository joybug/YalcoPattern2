package behavioral_patterns.mediator.ex02;

/**
 * AirportControlTower 클래스는 AirportMediator 인터페이스의 구현체로,
 * 활주로의 상태를 관리하는 관제탑 역할을 합니다.
 */
class AirportControlTower implements AirportMediator {
    private boolean isRunwayAvailable = true;

    @Override
    public boolean isRunwayAvailable() {
        return isRunwayAvailable;
    }

    @Override
    public void setRunwayAvailability(boolean status) {
        isRunwayAvailable = status;
    }
}
