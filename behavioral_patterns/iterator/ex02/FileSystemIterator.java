package behavioral_patterns.iterator.ex02;

/**
 * FileSystemIterator 인터페이스는 파일 시스템 항목을 순회(iteration)하는 표준 메서드를 정의합니다.
 * 구현체는 다양한 순회 방식을 제공할 수 있습니다.
 */
interface FileSystemIterator {
    /**
     * 다음 항목이 존재하는지 확인합니다.
     * @return 다음 항목이 있으면 true, 없으면 false
     */
    boolean hasNext();

    /**
     * 다음 항목을 반환합니다.
     * @return 다음 파일 시스템 항목
     */
    FileSystemItem next();
}
