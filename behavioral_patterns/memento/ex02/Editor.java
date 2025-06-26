package behavioral_patterns.memento.ex02;

/**
 * Editor 클래스는 문서 편집 기능과 undo(되돌리기) 기능을 제공합니다.
 * 내부적으로 Document와 DocumentHistory를 사용합니다.
 */
class Editor {
    /**
     * 실제 문서 객체입니다.
     */
    private final Document document;
    /**
     * 문서 상태 이력(undo용) 객체입니다.
     */
    private final DocumentHistory history;

    /**
     * Editor 객체를 생성합니다.
     * 내부적으로 Document와 DocumentHistory를 초기화합니다.
     */
    public Editor() {
        this.document = new Document();
        this.history = new DocumentHistory();
    }

    /**
     * 문서에 텍스트를 추가하고, 이전 상태를 이력에 저장합니다.
     * @param text 추가할 텍스트
     */
    public void write(String text) {
        history.push(document.save()); // 현재 상태 저장
        document.write(text); // 텍스트 추가
    }

    /**
     * 마지막으로 저장된 상태로 문서를 되돌립니다.
     * (undo 기능)
     */
    public void undo() {
        DocumentMemento memento = history.pop();
        if (memento != null) {
            document.restore(memento); // 상태 복원
        }
    }

    /**
     * 현재 문서의 전체 내용을 반환합니다.
     * @return 문서 내용
     */
    public String getContent() {
        return document.getContent();
    }
}
