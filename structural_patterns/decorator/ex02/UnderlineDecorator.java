package structural_patterns.decorator.ex02;

// UnderlineDecorator 클래스는 텍스트에 밑줄(underline)을 추가하는 데코레이터입니다.
public class UnderlineDecorator extends TextDecorator {
    // 생성자: 데코레이팅할 Text 객체를 받아 부모 생성자에 전달합니다.
    public UnderlineDecorator(Text text) {
        super(text);
    }

    // 텍스트 내용을 <u> 태그로 감싸 밑줄을 추가합니다.
    @Override
    public String getContent() {
        return "<u>" + super.getContent() + "</u>";
    }
}
