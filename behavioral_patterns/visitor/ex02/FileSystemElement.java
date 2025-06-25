package behavioral_patterns.visitor.ex02;

/**
 * 파일 시스템 요소(Element) 인터페이스
 */
public interface FileSystemElement {
    void accept(Visitor visitor);
}
