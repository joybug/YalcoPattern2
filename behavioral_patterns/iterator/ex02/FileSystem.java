package behavioral_patterns.iterator.ex02;

/**
 * FileSystem 클래스는 파일 시스템의 루트 디렉터리를 관리하고,
 * 다양한 순회 방식을 제공합니다.
 */
class FileSystem {
    /**
     * 파일 시스템의 루트 디렉터리입니다.
     */
    private Directory root;

    /**
     * FileSystem 객체를 생성합니다.
     * @param root 루트 디렉터리
     */
    public FileSystem(Directory root) {
        this.root = root;
    }

    /**
     * 깊이 우선(DFS) 순회 Iterator를 반환합니다.
     * @return DepthFirstIterator 객체
     */
    public FileSystemIterator depthFirstIterator() {
        return new DepthFirstIterator(root);
    }

    /**
     * 너비 우선(BFS) 순회 Iterator를 반환합니다.
     * @return BreadthFirstIterator 객체
     */
    public FileSystemIterator breadthFirstIterator() {
        return new BreadthFirstIterator(root);
    }
}
