package behavioral_patterns.memento.ex01;

/**
 * Main 클래스는 게임 상태 저장/복원(Memento 패턴) 예제를 실행합니다.
 * 게임 상태를 여러 번 저장하고, 이전 상태로 복원하는 과정을 보여줍니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 게임 및 관리 객체 생성
        Game game = new Game();
        GameCaretaker caretaker = new GameCaretaker();

        // 상태 1 저장
        game.set("Level 1", 100);
        caretaker.add(game.save());

        // 상태 2 저장
        game.set("Level 2", 200);
        caretaker.add(game.save());

        // 상태 3(저장하지 않음)
        game.set("Level 3", 300);

        // 이전 상태로 복원
        game.restore(caretaker.get(1)); // Level 2, 200
        game.restore(caretaker.get(0)); // Level 1, 100
    }
}
