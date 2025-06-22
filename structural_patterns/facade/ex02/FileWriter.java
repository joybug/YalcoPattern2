package structural_patterns.facade.ex02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// FileWriter 클래스는 파일에 데이터를 쓰는 기능을 제공합니다.
public class FileWriter {
    // 파일 경로와 내용을 받아 파일에 씁니다.
    public void writeFile(String filePath, String content) throws IOException {
        // 문자열을 바이트 배열로 변환하여 파일에 씁니다.
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
