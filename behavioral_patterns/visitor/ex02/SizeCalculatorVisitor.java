package behavioral_patterns.visitor.ex02;

/**
 * 파일 시스템 전체 크기 계산 방문자 클래스입니다.
 * <p>
 * Visitor 인터페이스를 구현하여,
 * 파일/디렉터리를 순회하며 전체 크기를 누적 계산합니다.
 */
public class SizeCalculatorVisitor implements Visitor {
    /**
     * 전체 파일 시스템 크기(누적)
     */
    private long totalSize = 0;

    /**
     * 파일의 크기를 누적합니다.
     * @param file 방문할 파일 객체
     */
    @Override
    public void visit(File file) {
        // 파일 크기 누적
        totalSize += file.getSize();
    }

    /**
     * 디렉터리 내부의 모든 요소를 재귀적으로 방문합니다.
     * @param directory 방문할 디렉터리 객체
     */
    @Override
    public void visit(Directory directory) {
        // 하위 요소 모두 방문(재귀)
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }

    /**
     * 전체 크기 반환
     * @return 누적된 전체 크기(바이트)
     */
    public long getTotalSize() {
        return totalSize;
    }
}
