package behavioral_patterns.mediator.ex02;

/**
 * AirportSystem 클래스는 Mediator 패턴을 이용한 공항 관제 예제를 실행합니다.
 */
public class AirportSystem {
    public static void main(String[] args) {
        AirportMediator controlTower = new AirportControlTower();

        Flight flight1 = new Flight(controlTower, "KE123");
        Flight flight2 = new Flight(controlTower, "OZ456");
        Runway runway = new Runway(controlTower);

        flight1.land();
        flight2.land();
        runway.clear();
        flight2.land();
    }
}
