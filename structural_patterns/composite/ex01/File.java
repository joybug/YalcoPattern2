package structural_patterns.composite.ex01;

// File 클래스는 파일을 나타내며, FileSystemComponent 인터페이스를 구현합니다.
public class File implements FileSystemComponent {
    // 파일 이름과 크기를 저장하는 변수입니다.
    private String name;
    private int size;

    // 생성자: 파일 이름과 크기를 받아 File 객체를 생성합니다.
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // 파일 이름을 출력하는 메소드입니다.
    @Override
    public void printName() {
        System.out.println("File: " + name);
    }

    // 파일의 크기를 반환하는 메소드입니다.
    @Override
    public int getSize() {
        return size;
    }

    // 파일 이름을 반환하는 메소드입니다.
    @Override
    public String getName() {
        return name;
    }
}
