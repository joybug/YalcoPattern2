package structural_patterns.facade.ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// FileReader 클래스는 파일을 읽는 기능을 제공합니다.
public class FileReader {
    // 파일 경로를 받아 파일 내용을 문자열로 반환합니다.
    public String readFile(String filePath) throws IOException {
        // 파일의 모든 바이트를 읽어 문자열로 변환합니다.
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
