package behavioral_patterns.memento.ex01;

/**
 * GameMemento 클래스는 게임의 상태(레벨, 점수)를 저장하는 역할을 합니다.
 * Memento 패턴의 Memento 역할입니다.
 */
class GameMemento {
    private String level;
    private int score;

    public GameMemento(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}
