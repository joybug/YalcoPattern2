package structural_patterns.decorator.ex02;

// TextDecorator 클래스는 Text 인터페이스를 구현하는 추상 데코레이터입니다.
// 실제 데코레이터(굵게, 기울임, 밑줄 등)는 이 클래스를 상속받아 기능을 확장합니다.
public abstract class TextDecorator implements Text {
    // 데코레이팅할 Text 객체를 참조합니다.
    protected Text decoratedText;

    // 생성자: 데코레이팅할 Text 객체를 받아 저장합니다.
    public TextDecorator(Text text) {
        this.decoratedText = text;
    }

    // Text 인터페이스의 getContent 메소드 구현
    // 기본적으로 내부 Text의 내용을 반환합니다.
    @Override
    public String getContent() {
        return decoratedText.getContent();
    }
}
