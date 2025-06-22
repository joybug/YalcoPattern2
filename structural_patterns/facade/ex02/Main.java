package structural_patterns.facade.ex02;

// Main 클래스는 FileSystemFacade를 이용해 파일을 읽고, 쓰고, 삭제하는 예제입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 퍼사드 객체를 생성합니다.
        FileSystemFacade fs = new FileSystemFacade();

        // 파일에 데이터를 씁니다.
        boolean writeSuccess = fs.writeFile(
            "test.txt", "Hello, Facade Pattern!"
        );
        System.out.println("File write success: " + writeSuccess);

        // 파일에서 데이터를 읽습니다.
        String content = fs.readFile("test.txt");
        System.out.println("File content: " + content);

        // 파일을 삭제합니다.
        boolean deleteSuccess = fs.deleteFile("test.txt");
        System.out.println(
            "File delete success: " + deleteSuccess
        );
    }
}
