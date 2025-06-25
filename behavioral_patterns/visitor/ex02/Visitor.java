package behavioral_patterns.visitor.ex02;

/**
 * 방문자(Visitor) 인터페이스
 */
public interface Visitor {
    void visit(File file);
    void visit(Directory directory);
}
