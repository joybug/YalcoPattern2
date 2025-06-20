package structural_patterns.composite.ex02;

public interface UIComponent {
    void render();
    void add(UIComponent component);
    void remove(UIComponent component);
}
