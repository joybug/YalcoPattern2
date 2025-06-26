package behavioral_patterns.memento.ex01;

/**
 * GameMemento 클래스는 게임의 상태(레벨, 점수)를 저장하는 역할을 합니다.
 * Memento 패턴의 Memento 역할입니다.
 */
class GameMemento {
    /**
     * 저장된 게임 레벨입니다.
     */
    private String level;
    /**
     * 저장된 게임 점수입니다.
     */
    private int score;

    /**
     * GameMemento 객체를 생성합니다.
     * @param level 저장할 레벨
     * @param score 저장할 점수
     */
    public GameMemento(String level, int score) {
        this.level = level;
        this.score = score;
    }

    /**
     * 저장된 레벨을 반환합니다.
     * @return 레벨
     */
    public String getLevel() {
        return level;
    }

    /**
     * 저장된 점수를 반환합니다.
     * @return 점수
     */
    public int getScore() {
        return score;
    }
}
