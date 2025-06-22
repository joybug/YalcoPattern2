package structural_patterns.facade.ex02;

// FileSystemFacade 클래스는 파일 읽기, 쓰기, 삭제 기능을 간단하게 사용할 수 있도록 퍼사드 역할을 합니다.
public class FileSystemFacade {
    // 내부적으로 사용할 파일 관련 객체들을 참조합니다.
    private FileReader fileReader;
    private FileWriter fileWriter;
    private FileDeleter fileDeleter;

    // 생성자: 각 파일 관련 객체를 생성합니다.
    public FileSystemFacade() {
        this.fileReader = new FileReader();
        this.fileWriter = new FileWriter();
        this.fileDeleter = new FileDeleter();
    }

    // 파일을 읽어 문자열로 반환하는 메소드입니다.
    public String readFile(String filePath) {
        try {
            return fileReader.readFile(filePath);
        } catch (java.io.IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null;
        }
    }

    // 파일에 내용을 쓰는 메소드입니다.
    public boolean writeFile(String filePath, String content) {
        try {
            fileWriter.writeFile(filePath, content);
            return true;
        } catch (java.io.IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
            return false;
        }
    }

    // 파일을 삭제하는 메소드입니다.
    public boolean deleteFile(String filePath) {
        try {
            fileDeleter.deleteFile(filePath);
            return true;
        } catch (java.io.IOException e) {
            System.err.println("Error deleting file: " + e.getMessage());
            return false;
        }
    }
}
