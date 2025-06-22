package structural_patterns.flyweight.ex02;

// ConcreteFont 클래스는 실제 글꼴 정보를 저장하고, 텍스트에 글꼴을 적용합니다.
public class ConcreteFont implements Font {
    // 글꼴 이름, 크기, 색상 정보를 저장하는 변수입니다.
    private String font;
    private int size;
    private String color;

    // 생성자: 글꼴 이름, 크기, 색상을 받아 ConcreteFont 객체를 생성합니다.
    public ConcreteFont(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    // Font 인터페이스의 apply 메소드 구현
    // 지정한 텍스트에 글꼴을 적용합니다.
    @Override
    public void apply(String text) {
        // 글꼴 정보와 함께 텍스트를 출력합니다.
        System.out.println(
            "Text: '" + text + "' with Font: "
            + font + ", Size: " + size + ", Color: " + color);
    }
}
