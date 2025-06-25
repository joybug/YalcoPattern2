package behavioral_patterns.iterator.ex02;

/**
 * File 클래스는 파일 시스템의 파일을 나타냅니다.
 */
class File implements FileSystemItem {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
