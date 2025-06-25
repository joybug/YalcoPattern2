package behavioral_patterns.memento.ex01;

/**
 * Game 클래스는 게임의 상태를 관리하며,
 * 상태 저장/복원 기능을 제공합니다. (Originator 역할)
 */
class Game {
    private String level;
    private int score;

    public void set(String level, int score) {
        this.level = level;
        this.score = score;
        System.out.println("Game state set to - Level: " + level + ", Score: " + score);
    }

    /**
     * 현재 상태를 저장한 Memento 객체를 반환합니다.
     */
    public GameMemento save() {
        return new GameMemento(level, score);
    }

    /**
     * 전달받은 Memento 객체로 상태를 복원합니다.
     */
    public void restore(GameMemento memento) {
        this.level = memento.getLevel();
        this.score = memento.getScore();
        System.out.println("Game state restored to - Level: " + level + ", Score: " + score);
    }
}
