package behavioral_patterns.state.compliant.ex01;

/**
 * 상태 패턴(State Pattern) 예제의 메인 클래스입니다.
 * <p>
 * Door 객체를 생성하고, open(), close() 메서드를 호출하여
 * 상태에 따라 동작이 달라지는 것을 확인할 수 있습니다.
 */
public class Main {
    /**
     * 프로그램의 시작점(main 메서드)
     * <p>
     * Door 객체를 생성하고, 여러 번 open/close을 호출하여
     * 상태 변화에 따른 동작을 출력합니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // Door 객체 생성(초기 상태: 닫힘)
        Door door = new Door();

        // 문을 열고 닫는 동작을 여러 번 시도
        door.open();   // 문을 열었습니다.
        door.open();   // 문이 이미 열려 있습니다.
        door.close();  // 문을 닫았습니다.
        door.close();  // 문이 이미 닫혀 있습니다.
    }
}
