package structural_patterns.decorator.ex02;

// Main 클래스는 다양한 텍스트 데코레이터의 동작을 테스트하는 실행 진입점입니다.
public class Main {
    // 프로그램의 시작점인 main 메소드입니다.
    public static void main(String[] args) {
        // 꾸밈없는 기본 텍스트를 만듭니다.
        Text text = new PlainText("Hello, Decorator Pattern!");
        System.out.println("Plain text: " + text.getContent());

        // 텍스트를 굵게 만듭니다.
        text = new BoldDecorator(text);
        System.out.println("Bold text: " + text.getContent());

        // 텍스트를 기울임으로 만듭니다.
        text = new ItalicDecorator(text);
        System.out.println(
            "Bold and italic text: " + text.getContent());

        // 텍스트에 밑줄을 추가합니다.
        text = new UnderlineDecorator(text);
        System.out.println(
            "Bold, italic, and underlined text: "
             + text.getContent()
        );

        // 또 다른 예시: 밑줄+기울임 텍스트
        Text anotherText = new UnderlineDecorator(
            new ItalicDecorator(
                new PlainText("Another example")
            )
        );
        System.out.println(
            "Underlined and italic text: "
             + anotherText.getContent()
        );
    }
}
