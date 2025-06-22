package structural_patterns.composite.ex01;

// FileSystemComponent 인터페이스는 파일과 폴더(디렉터리)의 공통 기능을 정의합니다.
public interface FileSystemComponent {
    // 이름을 출력하는 메소드입니다.
    void printName();
    // 크기를 반환하는 메소드입니다.
    int getSize();
    // 이름을 반환하는 메소드입니다.
    String getName();
}
