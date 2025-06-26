package behavioral_patterns.iterator.ex02;

/**
 * Main 클래스는 파일 시스템을 깊이 우선/너비 우선으로 순회하는 예제를 실행합니다.
 * 각 Iterator의 동작을 확인할 수 있습니다.
 */
public class Main {
    /**
     * 프로그램의 시작점입니다.
     * @param args 커맨드라인 인자(사용하지 않음)
     */
    public static void main(String[] args) {
        // 디렉터리 및 파일 객체 생성
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // 디렉터리 구조 구성
        root.add(home);
        home.add(user);
        user.add(file1);
        user.add(file2);
        home.add(file3);

        // 파일 시스템 생성
        FileSystem fileSystem = new FileSystem(root);

        // 깊이 우선 순회(DFS) 예제
        System.out.println("Depth-First Traversal:");
        FileSystemIterator depthIterator = fileSystem.depthFirstIterator();
        while (depthIterator.hasNext()) {
            // 각 항목의 이름을 출력
            System.out.println(depthIterator.next().getName());
        }

        // 너비 우선 순회(BFS) 예제
        System.out.println("\nBreadth-First Traversal:");
        FileSystemIterator breadthIterator = fileSystem.breadthFirstIterator();
        while (breadthIterator.hasNext()) {
            // 각 항목의 이름을 출력
            System.out.println(breadthIterator.next().getName());
        }
    }
}
