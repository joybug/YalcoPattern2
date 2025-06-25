package behavioral_patterns.memento.ex02;

import java.util.Stack;

/**
 * DocumentHistory 클래스는 문서 상태의 이력을 관리합니다.
 * Memento 객체를 보관/제공하는 Caretaker 역할입니다.
 */
class DocumentHistory {
    private final Stack<DocumentMemento> history = new Stack<>();

    public void push(DocumentMemento memento) {
        history.push(memento);
    }

    public DocumentMemento pop() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
