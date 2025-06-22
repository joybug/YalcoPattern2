package structural_patterns.facade.ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// FileDeleter 클래스는 파일을 삭제하는 기능을 제공합니다.
public class FileDeleter {
    // 파일 경로를 받아 파일을 삭제합니다.
    public void deleteFile(String filePath) throws IOException {
        // 지정한 경로의 파일을 삭제합니다.
        Files.delete(Paths.get(filePath));
    }
}
