package behavioral_patterns.visitor.ex02;

/**
 * 방문자(Visitor) 인터페이스입니다.
 * <p>
 * 파일(File), 디렉터리(Directory)에 대해 방문(visit)하여
 * 다양한 연산(크기 계산, 파일 검색 등)을 수행할 수 있도록 메서드를 정의합니다.
 */
public interface Visitor {
    /**
     * 파일 객체를 방문하여 연산을 수행합니다.
     * @param file 방문할 파일 객체
     */
    void visit(File file);
    /**
     * 디렉터리 객체를 방문하여 연산을 수행합니다.
     * @param directory 방문할 디렉터리 객체
     */
    void visit(Directory directory);
}
