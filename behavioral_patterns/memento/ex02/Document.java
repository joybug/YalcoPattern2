package behavioral_patterns.memento.ex02;

/**
 * Document 클래스는 문서의 내용을 관리하며,
 * 상태 저장/복원 기능을 제공합니다. (Originator 역할)
 */
class Document {
    private StringBuilder content;

    public Document() {
        this.content = new StringBuilder();
    }

    public void write(String text) {
        content.append(text);
    }

    public String getContent() {
        return content.toString();
    }

    public DocumentMemento save() {
        return new DocumentMemento(content.toString());
    }

    public void restore(DocumentMemento memento) {
        this.content = new StringBuilder(memento.getContent());
    }
}
