package structural_patterns.proxy.ex01;

// Main 클래스는 ProxyImage의 동작을 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // "test_image.jpg" 파일을 사용하는 ProxyImage 객체를 생성합니다.
        ProxyImage image = new ProxyImage("test_image.jpg");

        // 파일 이름과 확장자를 출력합니다.
        System.out.println("File name: " + image.getFileName());
        System.out.println("File extension: " + image.getFileExtension());

        // 이미지를 두 번 표시합니다.
        // 첫 번째 호출 시 실제 이미지를 디스크에서 불러오고, 두 번째는 캐시된 이미지를 사용합니다.
        image.display();
        image.display();
    }
}
