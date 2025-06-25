package behavioral_patterns.iterator.ex02;

/**
 * FileSystemIterator 인터페이스는 파일 시스템 항목을 순회하는 표준 메서드를 정의합니다.
 */
interface FileSystemIterator {
    boolean hasNext();
    FileSystemItem next();
}
