package behavioral_patterns.visitor.ex02;

/**
 * 파일 클래스 (Leaf)
 */
public class File implements FileSystemElement {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() { return name; }
    public long getSize() { return size; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
