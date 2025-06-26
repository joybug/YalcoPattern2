package behavioral_patterns.visitor.ex02;

/**
 * 파일 시스템 요소(Element) 인터페이스입니다.
 * <p>
 * Visitor 객체를 받아들이는 accept() 메서드를 정의합니다.
 * 파일(File), 디렉터리(Directory)는 이 인터페이스를 구현합니다.
 */
public interface FileSystemElement {
    /**
     * Visitor 객체를 받아들이는 메서드입니다.
     * @param visitor 방문자 객체
     */
    void accept(Visitor visitor);
}
