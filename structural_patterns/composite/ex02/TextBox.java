package structural_patterns.composite.ex02;

// TextBox 클래스는 텍스트 입력 UI 컴포넌트를 나타냅니다.
public class TextBox implements UIComponent {
    // 텍스트박스에 표시될 텍스트를 저장하는 변수입니다.
    private String text;

    // 생성자: 텍스트를 받아 TextBox 객체를 생성합니다.
    public TextBox(String text) {
        this.text = text;
    }

    // 텍스트박스를 화면에 그리는 메소드입니다.
    @Override
    public void render() {
        System.out.println("TextBox: " + text);
    }

    // TextBox는 하위 컴포넌트를 가질 수 없으므로 예외를 발생시킵니다.
    @Override
    public void add(UIComponent component) {
        throw new UnsupportedOperationException();
    }

    // TextBox는 하위 컴포넌트를 가질 수 없으므로 예외를 발생시킵니다.
    @Override
    public void remove(UIComponent component) {
        throw new UnsupportedOperationException();
    }
}
