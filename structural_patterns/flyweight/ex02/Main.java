package structural_patterns.flyweight.ex02;

// Main 클래스는 FontFactory와 Font의 동작을 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // "Arial", 12, "Black" 속성의 글꼴을 가져와 텍스트에 적용합니다.
        Font font1 = FontFactory.getFont("Arial", 12, "Black");
        font1.apply("Hello, World!");

        // 같은 속성의 글꼴을 다시 가져오면 기존 객체를 재사용합니다.
        Font font2 = FontFactory.getFont("Arial", 12, "Black");
        font2.apply("Flyweight Pattern");

        // 다른 속성의 글꼴을 가져와 텍스트에 적용합니다.
        Font font3 = FontFactory.getFont("Times New Roman", 14, "Blue");
        font3.apply("Design Patterns");

        // 다시 같은 속성의 글꼴을 가져와 텍스트에 적용합니다.
        Font font4 = FontFactory.getFont("Arial", 12, "Black");
        font4.apply("Another Text");
    }
}
