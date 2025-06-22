package structural_patterns.composite.ex02;

// UIComponent 인터페이스는 모든 UI 구성요소(버튼, 텍스트박스, 패널 등)의 공통 기능을 정의합니다.
public interface UIComponent {
    // UI를 화면에 그리는 메소드입니다.
    void render();
    // 하위 컴포넌트를 추가하는 메소드입니다.
    void add(UIComponent component);
    // 하위 컴포넌트를 제거하는 메소드입니다.
    void remove(UIComponent component);
}
