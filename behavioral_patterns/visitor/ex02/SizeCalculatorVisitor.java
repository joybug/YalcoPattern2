package behavioral_patterns.visitor.ex02;

/**
 * 파일 시스템 전체 크기 계산 방문자
 */
public class SizeCalculatorVisitor implements Visitor {
    private long totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }

    public long getTotalSize() {
        return totalSize;
    }
}
