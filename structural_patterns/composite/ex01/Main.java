package structural_patterns.composite.ex01;

// Main 클래스는 파일/폴더 구조를 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 파일 객체를 생성합니다.
        File file1 = new File("Document.txt", 100);
        File file2 = new File("Image.jpg", 200);

        // 하위 폴더를 생성하고 파일을 추가합니다.
        Directory subDir = new Directory("SubFolder");
        subDir.add(new File("SubFile.txt", 50));

        // 루트 폴더를 생성하고 파일과 하위 폴더를 추가합니다.
        Directory rootDir = new Directory("RootFolder");
        rootDir.add(file1);
        rootDir.add(file2);
        rootDir.add(subDir);

        System.out.println("Initial structure:");
        rootDir.printName();
        System.out.println(
            "Total size: " + rootDir.getSize() + " KB");

        System.out.println("\nRemoving Image.jpg:");
        rootDir.remove("Image.jpg");
        rootDir.printName();
        System.out.println(
            "Total " + rootDir.getSize() + " KB");

        System.out.println("\nRemoving SubFolder:");
        rootDir.remove(subDir);
        rootDir.printName();
        System.out.println(
            "Total size: " + rootDir.getSize() + " KB");
    }
}
