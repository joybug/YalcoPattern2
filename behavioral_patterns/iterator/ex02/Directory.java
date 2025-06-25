package behavioral_patterns.iterator.ex02;

import java.util.*;

/**
 * Directory 클래스는 파일 시스템의 디렉터리를 나타냅니다.
 * 하위 항목(파일/디렉터리)을 가질 수 있습니다.
 */
class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> contents = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        contents.add(item);
    }

    public List<FileSystemItem> getContents() {
        return contents;
    }

    @Override
    public String getName() {
        return name;
    }
}
