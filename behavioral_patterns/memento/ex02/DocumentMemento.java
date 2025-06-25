package behavioral_patterns.memento.ex02;

/**
 * DocumentMemento 클래스는 문서의 내용을 저장하는 역할을 합니다.
 * Memento 패턴의 Memento 역할입니다.
 */
class DocumentMemento {
    private final String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
