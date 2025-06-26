package behavioral_patterns.visitor.ex02;

import java.util.List;
import java.util.ArrayList;

/**
 * 디렉터리(Directory) 클래스 - Composite 역할
 * <p>
 * FileSystemElement 인터페이스를 구현하며, 내부에 여러 파일/디렉터리를 가질 수 있습니다.
 * accept()를 통해 Visitor를 받아들입니다.
 */
public class Directory implements FileSystemElement {
    /**
     * 디렉터리 이름
     */
    private String name;
    /**
     * 하위 파일/디렉터리 목록
     */
    private List<FileSystemElement> elements;

    /**
     * Directory 생성자입니다.
     * @param name 디렉터리 이름
     */
    public Directory(String name) {
        // 필드 초기화
        this.name = name;
        this.elements = new ArrayList<>();
    }

    /**
     * 디렉터리 이름 반환
     * @return 디렉터리 이름
     */
    public String getName() { return name; }

    /**
     * 하위 요소(파일/디렉터리) 추가
     * @param element 추가할 요소
     */
    public void addElement(FileSystemElement element) {
        elements.add(element);
    }
    /**
     * 하위 요소 목록 반환
     * @return 요소 리스트
     */
    public List<FileSystemElement> getElements() {
        return elements;
    }

    /**
     * Visitor를 받아들이고, 자신(this)을 방문하도록 위임합니다.
     * @param visitor 방문자 객체
     */
    @Override
    public void accept(Visitor visitor) {
        // Visitor의 visit(Directory) 호출
        visitor.visit(this);
    }
}
