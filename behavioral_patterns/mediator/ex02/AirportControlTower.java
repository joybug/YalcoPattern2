package behavioral_patterns.mediator.ex02;

/**
 * AirportControlTower 클래스는 AirportMediator 인터페이스의 구현체로,
 * 활주로의 상태를 관리하는 관제탑 역할을 합니다.
 */
class AirportControlTower implements AirportMediator {
    /**
     * 활주로가 사용 가능한지 여부를 저장하는 변수입니다.
     */
    private boolean isRunwayAvailable = true;

    /**
     * 활주로가 사용 가능한지 여부를 반환합니다.
     * @return 사용 가능 여부
     */
    @Override
    public boolean isRunwayAvailable() {
        return isRunwayAvailable;
    }

    /**
     * 활주로의 사용 가능 상태를 설정합니다.
     * @param status 사용 가능 여부
     */
    @Override
    public void setRunwayAvailability(boolean status) {
        isRunwayAvailable = status;
    }
}
