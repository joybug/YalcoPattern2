package behavioral_patterns.visitor.ex02;

/**
 * Visitor 패턴 파일 시스템 예제의 메인 클래스입니다.
 * <p>
 * 파일/디렉터리 객체를 생성하고, SizeCalculatorVisitor(전체 크기 계산),
 * FileSearchVisitor(파일 검색) 방문자를 적용하여 다양한 연산이 가능함을 보여줍니다.
 */
public class Main {
    /**
     * 프로그램의 시작점(main 메서드)
     * <p>
     * 파일/디렉터리 객체와 방문자 객체를 생성하고, accept()를 통해 연산을 수행합니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 파일 객체 생성
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);
        File file3 = new File("file3.txt", 300);

        // 디렉터리 생성 및 파일 추가
        Directory dir1 = new Directory("Folder1");
        dir1.addElement(file1);
        dir1.addElement(file2);

        Directory dir2 = new Directory("Folder2");
        dir2.addElement(file3);

        Directory rootDir = new Directory("Root");
        rootDir.addElement(dir1);
        rootDir.addElement(dir2);

        // 전체 크기 계산 방문자 적용
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        rootDir.accept(sizeVisitor);
        System.out.println(
          "Total size of file system: "
           + sizeVisitor.getTotalSize() + " bytes");

        // 파일 검색 방문자 적용
        FileSearchVisitor searchVisitor = new FileSearchVisitor("file3.txt");
        rootDir.accept(searchVisitor);
        File foundFile = searchVisitor.getFoundFile();
        if (foundFile != null) {
            System.out.println(
                "File found: " + foundFile.getName()
                 + ", Size: " + foundFile.getSize()
                 + " bytes");
        } else {
            System.out.println("File not found.");
        }
    }
}
