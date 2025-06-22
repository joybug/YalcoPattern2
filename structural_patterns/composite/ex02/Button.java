package structural_patterns.composite.ex02;

// Button 클래스는 버튼 UI 컴포넌트를 나타냅니다.
public class Button implements UIComponent {
    // 버튼의 라벨(이름)을 저장하는 변수입니다.
    private String label;

    // 생성자: 버튼 라벨을 받아 Button 객체를 생성합니다.
    public Button(String label) {
        this.label = label;
    }

    // 버튼을 화면에 그리는 메소드입니다.
    @Override
    public void render() {
        System.out.println("Button: " + label);
    }

    // Button은 하위 컴포넌트를 가질 수 없으므로 예외를 발생시킵니다.
    @Override
    public void add(UIComponent component) {
        throw new UnsupportedOperationException();
    }

    // Button은 하위 컴포넌트를 가질 수 없으므로 예외를 발생시킵니다.
    @Override
    public void remove(UIComponent component) {
        throw new UnsupportedOperationException();
    }
}
