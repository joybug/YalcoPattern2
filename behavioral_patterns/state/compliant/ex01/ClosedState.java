package behavioral_patterns.state.compliant.ex01;

/**
 * 문이 닫혀 있는 상태(ClosedState)를 나타내는 클래스입니다.
 * <p>
 * 상태 패턴에서 구체적인 상태(닫힘)에 해당하며,
 * open(), close() 메서드의 동작을 정의합니다.
 */
public class ClosedState implements State {
    /**
     * ClosedState의 생성자입니다.
     * 특별한 동작은 없으며, 객체 생성 시 호출됩니다.
     */
    public ClosedState() {
        // 생성자 - 별도의 초기화 로직 없음
    }

    /**
     * 문을 여는 동작을 수행합니다.
     * 상태를 OpenState로 변경합니다.
     * @param door 상태가 변경될 문 객체
     */
    @Override
    public void open(Door door) {
        // 상태를 열림(OpenState)으로 변경
        door.setState(new OpenState());
        System.out.println("문을 열었습니다.");
    }

    /**
     * 이미 문이 닫혀 있으므로, 추가로 닫을 수 없다는 메시지를 출력합니다.
     * @param door 상태가 변경될 문 객체
     */
    @Override
    public void close(Door door) {
        // 이미 닫혀 있으므로 안내 메시지 출력
        System.out.println("문이 이미 닫혀 있습니다.");
    }
}
