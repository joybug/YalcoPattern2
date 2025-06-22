package structural_patterns.composite.ex01;

import java.util.List;
import java.util.ArrayList;

// Directory 클래스는 폴더(디렉터리)를 나타내며, 내부에 파일이나 다른 폴더를 가질 수 있습니다.
// FileSystemComponent 인터페이스를 구현합니다.
public class Directory implements FileSystemComponent {
    // 폴더 이름과 내부 구성요소(파일/폴더) 리스트를 저장합니다.
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    // 생성자: 폴더 이름을 받아 Directory 객체를 생성합니다.
    public Directory(String name) {
        this.name = name;
    }

    // 폴더에 구성요소(파일/폴더)를 추가하는 메소드입니다.
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    // 폴더에서 구성요소(파일/폴더)를 제거하는 메소드입니다.
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    // 폴더에서 이름으로 구성요소를 제거하는 메소드입니다.
    public void remove(String name) {
        components.removeIf(component -> component.getName().equals(name));
    }

    // 폴더 이름과 내부 구성요소의 이름을 출력하는 메소드입니다.
    @Override
    public void printName() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.printName();
        }
    }

    // 폴더의 전체 크기를 계산하는 메소드입니다.
    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    // 폴더 이름을 반환하는 메소드입니다.
    @Override
    public String getName() {
        return name;
    }
}
