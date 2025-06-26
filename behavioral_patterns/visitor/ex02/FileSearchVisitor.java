package behavioral_patterns.visitor.ex02;

/**
 * 파일 이름으로 파일을 찾는 방문자 클래스입니다.
 * <p>
 * Visitor 인터페이스를 구현하여,
 * 파일/디렉터리를 순회하며 지정한 이름의 파일을 찾습니다.
 */
public class FileSearchVisitor implements Visitor {
    /**
     * 찾을 파일 이름
     */
    private String searchFileName;
    /**
     * 찾은 파일 객체(없으면 null)
     */
    private File foundFile;

    /**
     * FileSearchVisitor 생성자입니다.
     * @param searchFileName 찾을 파일 이름
     */
    public FileSearchVisitor(String searchFileName) {
        // 필드 초기화
        this.searchFileName = searchFileName;
    }

    /**
     * 파일 이름이 일치하면 foundFile에 저장합니다.
     * @param file 방문할 파일 객체
     */
    @Override
    public void visit(File file) {
        // 파일 이름이 찾는 이름과 같으면 저장
        if (file.getName().equals(searchFileName)) {
            foundFile = file;
        }
    }

    /**
     * 디렉터리 내부의 모든 요소를 재귀적으로 방문합니다.
     * @param directory 방문할 디렉터리 객체
     */
    @Override
    public void visit(Directory directory) {
        // 하위 요소 모두 방문(재귀)
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }

    /**
     * 찾은 파일 반환
     * @return 찾은 파일 객체(없으면 null)
     */
    public File getFoundFile() {
        return foundFile;
    }
}
