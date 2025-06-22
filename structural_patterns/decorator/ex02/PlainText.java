package structural_patterns.decorator.ex02;

// PlainText 클래스는 꾸밈없는 기본 텍스트를 나타냅니다.
public class PlainText implements Text {
    // 텍스트 내용을 저장하는 변수입니다.
    private String content;

    // 생성자: 텍스트 내용을 받아 PlainText 객체를 생성합니다.
    public PlainText(String content) {
        this.content = content;
    }

    // 텍스트 내용을 반환합니다.
    @Override
    public String getContent() {
        return content;
    }
}
