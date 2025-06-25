package behavioral_patterns.memento.ex02;

/**
 * Editor 클래스는 문서 편집 기능과 undo(되돌리기) 기능을 제공합니다.
 * 내부적으로 Document와 DocumentHistory를 사용합니다.
 */
class Editor {
    private final Document document;
    private final DocumentHistory history;

    public Editor() {
        this.document = new Document();
        this.history = new DocumentHistory();
    }

    public void write(String text) {
        history.push(document.save());
        document.write(text);
    }

    public void undo() {
        DocumentMemento memento = history.pop();
        if (memento != null) {
            document.restore(memento);
        }
    }

    public String getContent() {
        return document.getContent();
    }
}
