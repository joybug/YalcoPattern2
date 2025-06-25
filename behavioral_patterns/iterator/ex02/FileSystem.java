package behavioral_patterns.iterator.ex02;

/**
 * FileSystem 클래스는 파일 시스템의 루트 디렉터리를 관리하고,
 * 다양한 순회 방식을 제공합니다.
 */
class FileSystem {
    private Directory root;

    public FileSystem(Directory root) {
        this.root = root;
    }

    public FileSystemIterator depthFirstIterator() {
        return new DepthFirstIterator(root);
    }

    public FileSystemIterator breadthFirstIterator() {
        return new BreadthFirstIterator(root);
    }
}
