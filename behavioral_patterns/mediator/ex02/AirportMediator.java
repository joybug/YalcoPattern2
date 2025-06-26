package behavioral_patterns.mediator.ex02;

/**
 * AirportMediator 인터페이스는 관제탑과 활주로, 비행기 간의 중재 역할을 정의합니다.
 * 활주로의 사용 가능 여부를 확인하고, 상태를 변경하는 기능을 제공합니다.
 */
interface AirportMediator {
    /**
     * 활주로가 사용 가능한지 여부를 반환합니다.
     * @return 사용 가능 여부
     */
    boolean isRunwayAvailable();

    /**
     * 활주로의 사용 가능 상태를 설정합니다.
     * @param status 사용 가능 여부
     */
    void setRunwayAvailability(boolean status);
}
