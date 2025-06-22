package structural_patterns.proxy.ex01;

// Image 인터페이스는 이미지 객체가 가져야 할 기능을 정의합니다.
// display()로 이미지를 화면에 표시하고, getFileName()으로 파일명을 가져옵니다.
public interface Image {
    // 이미지를 화면에 표시하는 메소드입니다.
    void display();
    // 이미지 파일의 이름을 반환하는 메소드입니다.
    String getFileName();
}
