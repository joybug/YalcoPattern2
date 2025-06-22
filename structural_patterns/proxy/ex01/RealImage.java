package structural_patterns.proxy.ex01;

// RealImage 클래스는 실제 이미지를 나타내며, 이미지를 디스크에서 불러오고 화면에 표시합니다.
public class RealImage implements Image {
    // 이미지 파일 이름을 저장하는 변수입니다.
    private String fileName;

    // 생성자: 파일 이름을 받아 RealImage 객체를 생성합니다.
    public RealImage(String fileName) {
        this.fileName = fileName;
        // 이미지를 디스크에서 불러옵니다.
        loadFromDisk();
    }

    // 이미지를 디스크에서 불러오는 메소드입니다.
    private void loadFromDisk() {
        // 실제로는 파일을 읽는 작업이지만, 여기서는 메시지만 출력합니다.
        System.out.println("Loading " + fileName);
    }

    // Image 인터페이스의 display 메소드 구현
    // 이미지를 화면에 표시합니다.
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    // Image 인터페이스의 getFileName 메소드 구현
    // 이미지 파일 이름을 반환합니다.
    @Override
    public String getFileName() {
        return fileName;
    }
}
