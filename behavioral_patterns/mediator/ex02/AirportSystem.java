package behavioral_patterns.mediator.ex02;

/**
 * AirportSystem 클래스는 Mediator 패턴을 이용한 공항 관리 예제를 실행합니다.
 * 비행기와 활주로, 관제탑의 상호작용을 보여줍니다.
 */
public class AirportSystem {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 관제탑(중재자) 객체 생성
        AirportMediator controlTower = new AirportControlTower();

        // 비행기 및 활주로 객체 생성
        Flight flight1 = new Flight(controlTower, "KE123");
        Flight flight2 = new Flight(controlTower, "OZ456");
        Runway runway = new Runway(controlTower);

        // 첫 번째 비행기 착륙 시도
        flight1.land();
        // 두 번째 비행기 착륙 시도(활주로가 이미 사용 중이면 대기)
        flight2.land();
        // 활주로를 비움(사용 가능 상태로 변경)
        runway.clear();
        // 두 번째 비행기 다시 착륙 시도
        flight2.land();
    }
}
