package behavioral_patterns.visitor.ex02;

/**
 * 파일(File) 클래스 - Leaf 역할
 * <p>
 * FileSystemElement 인터페이스를 구현하며, accept()를 통해 Visitor를 받아들입니다.
 */
public class File implements FileSystemElement {
    /**
     * 파일 이름
     */
    private String name;
    /**
     * 파일 크기(바이트)
     */
    private long size;

    /**
     * File 생성자입니다.
     * @param name 파일 이름
     * @param size 파일 크기(바이트)
     */
    public File(String name, long size) {
        // 필드 초기화
        this.name = name;
        this.size = size;
    }

    /**
     * 파일 이름 반환
     * @return 파일 이름
     */
    public String getName() { return name; }
    /**
     * 파일 크기 반환
     * @return 파일 크기(바이트)
     */
    public long getSize() { return size; }

    /**
     * Visitor를 받아들이고, 자신(this)을 방문하도록 위임합니다.
     * @param visitor 방문자 객체
     */
    @Override
    public void accept(Visitor visitor) {
        // Visitor의 visit(File) 호출
        visitor.visit(this);
    }
}
