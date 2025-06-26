package behavioral_patterns.memento.ex01;

import java.util.List;
import java.util.ArrayList;

/**
 * GameCaretaker 클래스는 게임 상태의 이력을 관리합니다.
 * Memento 객체를 보관/제공하는 Caretaker 역할입니다.
 */
class GameCaretaker {
    /**
     * 저장된 게임 상태(Memento) 목록입니다.
     */
    private List<GameMemento> mementoList = new ArrayList<>();

    /**
     * 게임 상태를 저장합니다.
     * @param state 저장할 Memento 객체
     */
    public void add(GameMemento state) {
        mementoList.add(state);
    }

    /**
     * 저장된 게임 상태를 반환합니다.
     * @param index 가져올 인덱스
     * @return 해당 인덱스의 Memento 객체
     */
    public GameMemento get(int index) {
        return mementoList.get(index);
    }
}
