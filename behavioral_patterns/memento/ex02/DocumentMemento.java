package behavioral_patterns.memento.ex02;

/**
 * DocumentMemento 클래스는 문서의 내용을 저장하는 역할을 합니다.
 * Memento 패턴의 Memento 역할입니다.
 */
class DocumentMemento {
    /**
     * 저장된 문서 내용입니다.
     */
    private final String content;

    /**
     * DocumentMemento 객체를 생성합니다.
     * @param content 저장할 문서 내용
     */
    public DocumentMemento(String content) {
        this.content = content;
    }

    /**
     * 저장된 문서 내용을 반환합니다.
     * @return 문서 내용
     */
    public String getContent() {
        return content;
    }
}
