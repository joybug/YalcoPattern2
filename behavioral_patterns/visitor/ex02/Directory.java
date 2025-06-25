package behavioral_patterns.visitor.ex02;

import java.util.List;
import java.util.ArrayList;

/**
 * 디렉터리 클래스 (Composite)
 */
public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> elements;

    public Directory(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public String getName() { return name; }

    public void addElement(FileSystemElement element) {
        elements.add(element);
    }
    public List<FileSystemElement> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
