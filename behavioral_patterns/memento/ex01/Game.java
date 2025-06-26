package behavioral_patterns.memento.ex01;

/**
 * Game 클래스는 게임의 상태를 관리하며,
 * 상태 저장/복원 기능을 제공합니다. (Originator 역할)
 */
class Game {
    /**
     * 현재 게임 레벨입니다.
     */
    private String level;
    /**
     * 현재 게임 점수입니다.
     */
    private int score;

    /**
     * 게임 상태를 설정합니다.
     * @param level 레벨
     * @param score 점수
     */
    public void set(String level, int score) {
        this.level = level;
        this.score = score;
        // 상태 변경 로그 출력
        System.out.println("Game state set to - Level: " + level + ", Score: " + score);
    }

    /**
     * 현재 상태를 저장한 Memento 객체를 반환합니다.
     * @return 현재 상태의 Memento
     */
    public GameMemento save() {
        return new GameMemento(level, score);
    }

    /**
     * 전달받은 Memento 객체로 상태를 복원합니다.
     * @param memento 복원할 상태(Memento)
     */
    public void restore(GameMemento memento) {
        this.level = memento.getLevel();
        this.score = memento.getScore();
        // 복원 로그 출력
        System.out.println("Game state restored to - Level: " + level + ", Score: " + score);
    }
}
