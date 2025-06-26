package behavioral_patterns.iterator.ex02;

/**
 * 파일 시스템 항목(파일 또는 디렉터리)의 공통 기능을 정의하는 인터페이스입니다.
 */
interface FileSystemItem {
    /**
     * 항목의 이름을 반환합니다.
     * @return 항목 이름
     */
    String getName();
}
