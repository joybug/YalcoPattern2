package structural_patterns.decorator.ex02;

// BoldDecorator 클래스는 텍스트를 굵게(bold) 표시하는 데코레이터입니다.
public class BoldDecorator extends TextDecorator {
    // 생성자: 데코레이팅할 Text 객체를 받아 부모 생성자에 전달합니다.
    public BoldDecorator(Text text) {
        super(text);
    }

    // 텍스트 내용을 <b> 태그로 감싸 굵게 만듭니다.
    @Override
    public String getContent() {
        return "<b>" + super.getContent() + "</b>";
    }
}
