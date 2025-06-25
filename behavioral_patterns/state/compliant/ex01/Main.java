package behavioral_patterns.state.compliant.ex01;

/**
 * Main 클래스는 상태 패턴을 적용한 Door 예제를 실행합니다.
 */
public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        
        door.open();  // "Door is now Open."
        door.open();  // "Door is already Open."
        door.close(); // "Door is now Closed."
        door.close(); // "Door is already Closed."
    }
}
