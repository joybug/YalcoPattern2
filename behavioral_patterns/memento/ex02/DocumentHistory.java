package behavioral_patterns.memento.ex02;

import java.util.Stack;

/**
 * DocumentHistory 클래스는 문서 상태의 이력을 관리합니다.
 * Memento 객체를 보관/제공하는 Caretaker 역할입니다.
 */
class DocumentHistory {
    /**
     * 저장된 문서 상태(Memento) 스택입니다.
     */
    private final Stack<DocumentMemento> history = new Stack<>();

    /**
     * 문서 상태를 스택에 저장합니다.
     * @param memento 저장할 Memento 객체
     */
    public void push(DocumentMemento memento) {
        history.push(memento);
    }

    /**
     * 마지막으로 저장된 문서 상태를 꺼내 반환합니다.
     * @return 마지막 Memento 객체, 없으면 null
     */
    public DocumentMemento pop() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
