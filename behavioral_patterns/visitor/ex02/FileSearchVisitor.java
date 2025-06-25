package behavioral_patterns.visitor.ex02;

/**
 * 파일 이름으로 파일을 찾는 방문자
 */
public class FileSearchVisitor implements Visitor {
    private String searchFileName;
    private File foundFile;

    public FileSearchVisitor(String searchFileName) {
        this.searchFileName = searchFileName;
    }

    @Override
    public void visit(File file) {
        if (file.getName().equals(searchFileName)) {
            foundFile = file;
        }
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }
    }

    public File getFoundFile() {
        return foundFile;
    }
}
