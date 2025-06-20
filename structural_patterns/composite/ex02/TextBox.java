package structural_patterns.composite.ex02;

public class TextBox implements UIComponent {
    private String text;

    public TextBox(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("TextBox: " + text);
    }

    @Override
    public void add(UIComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(UIComponent component) {
        throw new UnsupportedOperationException();
    }
}
