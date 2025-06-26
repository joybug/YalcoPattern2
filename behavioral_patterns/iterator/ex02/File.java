package behavioral_patterns.iterator.ex02;

/**
 * File 클래스는 파일 시스템의 파일을 나타냅니다.
 * 파일 이름을 저장하고 반환하는 역할을 합니다.
 */
class File implements FileSystemItem {
    /**
     * 파일의 이름입니다.
     */
    private String name;

    /**
     * 파일 객체를 생성합니다.
     * @param name 파일 이름
     */
    public File(String name) {
        this.name = name;
    }

    /**
     * 파일의 이름을 반환합니다.
     * @return 파일 이름
     */
    @Override
    public String getName() {
        return name;
    }
}
