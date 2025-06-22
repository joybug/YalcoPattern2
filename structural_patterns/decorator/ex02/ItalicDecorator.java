package structural_patterns.decorator.ex02;

// ItalicDecorator 클래스는 텍스트를 기울임(italic)으로 표시하는 데코레이터입니다.
public class ItalicDecorator extends TextDecorator {
    // 생성자: 데코레이팅할 Text 객체를 받아 부모 생성자에 전달합니다.
    public ItalicDecorator(Text text) {
        super(text);
    }

    // 텍스트 내용을 <i> 태그로 감싸 기울임으로 만듭니다.
    @Override
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}
