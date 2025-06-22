package structural_patterns.proxy.ex01;

// ProxyImage 클래스는 RealImage 객체에 대한 프록시(대리자) 역할을 합니다.
// 실제 이미지는 필요할 때만 생성되어 메모리를 절약할 수 있습니다.
public class ProxyImage implements Image {
    // 실제 이미지 객체를 참조하는 변수입니다.
    private RealImage realImage;
    // 이미지 파일 이름을 저장하는 변수입니다.
    private String fileName;

    // 생성자: 파일 이름을 받아 ProxyImage 객체를 생성합니다.
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    // Image 인터페이스의 display 메소드 구현
    // 실제 이미지가 아직 생성되지 않았다면 생성 후 표시합니다.
    @Override
    public void display() {
        // realImage가 null이면 아직 실제 이미지가 생성되지 않은 상태입니다.
        if (realImage == null) {
            // 실제 이미지를 생성합니다(디스크에서 불러옴).
            realImage = new RealImage(fileName);
        }
        // 실제 이미지를 화면에 표시합니다.
        realImage.display();
    }

    // Image 인터페이스의 getFileName 메소드 구현
    // 이미지 파일 이름을 반환합니다.
    @Override
    public String getFileName() {
        return fileName;
    }

    // 파일의 확장자를 반환하는 메소드입니다.
    public String getFileExtension() {
        // 마지막 점(.)의 위치를 찾습니다.
        int lastIndex = fileName.lastIndexOf('.');
        // 점이 없으면 확장자가 없는 것입니다.
        if (lastIndex == -1) {
            return "";
        }
        // 점 이후의 문자열(확장자)을 반환합니다.
        return fileName.substring(lastIndex + 1);
    }
}
