package behavioral_patterns.memento.ex02;

/**
 * Document 클래스는 문서의 내용을 관리하며,
 * 상태 저장/복원 기능을 제공합니다. (Originator 역할)
 */
class Document {
    /**
     * 문서의 실제 내용을 저장하는 StringBuilder입니다.
     */
    private StringBuilder content;

    /**
     * Document 객체를 생성합니다.
     * 내용은 빈 문자열로 초기화됩니다.
     */
    public Document() {
        this.content = new StringBuilder();
    }

    /**
     * 문서에 텍스트를 추가합니다.
     * @param text 추가할 텍스트
     */
    public void write(String text) {
        content.append(text);
    }

    /**
     * 현재 문서의 전체 내용을 반환합니다.
     * @return 문서 내용
     */
    public String getContent() {
        return content.toString();
    }

    /**
     * 현재 상태를 저장한 Memento 객체를 반환합니다.
     * @return 현재 상태의 Memento
     */
    public DocumentMemento save() {
        return new DocumentMemento(content.toString());
    }

    /**
     * 전달받은 Memento 객체로 상태를 복원합니다.
     * @param memento 복원할 상태(Memento)
     */
    public void restore(DocumentMemento memento) {
        this.content = new StringBuilder(memento.getContent());
    }
}
