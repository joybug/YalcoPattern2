package behavioral_patterns.iterator.ex02;

import java.util.*;

/**
 * Directory 클래스는 파일 시스템의 디렉터리를 나타냅니다.
 * 하위 항목(파일/디렉터리)을 가질 수 있습니다.
 */
class Directory implements FileSystemItem {
    /**
     * 디렉터리의 이름입니다.
     */
    private String name;
    /**
     * 디렉터리 내부에 포함된 파일/디렉터리 목록입니다.
     */
    private List<FileSystemItem> contents = new ArrayList<>();

    /**
     * 디렉터리 객체를 생성합니다.
     * @param name 디렉터리 이름
     */
    public Directory(String name) {
        this.name = name;
    }

    /**
     * 하위 항목을 디렉터리에 추가합니다.
     * @param item 추가할 파일 또는 디렉터리
     */
    public void add(FileSystemItem item) {
        contents.add(item);
    }

    /**
     * 디렉터리의 하위 항목 목록을 반환합니다.
     * @return 파일/디렉터리 목록
     */
    public List<FileSystemItem> getContents() {
        return contents;
    }

    /**
     * 디렉터리의 이름을 반환합니다.
     * @return 디렉터리 이름
     */
    @Override
    public String getName() {
        return name;
    }
}
