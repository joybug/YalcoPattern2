package behavioral_patterns.memento.ex01;

/**
 * Main 클래스는 게임 상태 저장/복원(Memento 패턴) 예제를 실행합니다.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        GameCaretaker caretaker = new GameCaretaker();

        game.set("Level 1", 100);
        caretaker.add(game.save());

        game.set("Level 2", 200);
        caretaker.add(game.save());

        game.set("Level 3", 300);

        game.restore(caretaker.get(1));
        game.restore(caretaker.get(0));
    }
}
